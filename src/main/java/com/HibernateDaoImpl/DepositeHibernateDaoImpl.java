package com.HibernateDaoImpl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.DaoInterfaces.IDepositeDao;
import com.pojo.NewAccount;
import com.pojo.Transuction;

@Repository
public class DepositeHibernateDaoImpl implements IDepositeDao {
	private final static Logger logger = Logger.getLogger(DepositeHibernateDaoImpl.class);
	static SessionFactory sf;
	static {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	public Serializable deposite(NewAccount na, Transuction tn) {
		Session session = sf.openSession();
		session.beginTransaction();
		NewAccount na1 = (NewAccount) session.get(NewAccount.class, na.getAccountno());
		tn.setNacc(na1);

		Serializable save = session.save(tn);
		if (save == null) {
			return null;
		}
		na1.setAmount(na1.getAmount() + tn.getDeposite());
		session.update(na1);
		session.getTransaction().commit();
		return save;

	}

	public List<NewAccount> BalanceCheck(NewAccount na) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(NewAccount.class);
		criteria.add(Restrictions.eq("Accountno", na.getAccountno()));
		List<NewAccount> list = criteria.list();
		return list;

	}

}
