package com.HibernateDaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.DaoInterfaces.IBalanceDAo;
import com.pojo.NewAccount;

@Repository
public class BalanceInfoDaoHibernateImpl implements IBalanceDAo {

	static SessionFactory sf;
	static {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	public List<NewAccount> BalanceCheck(NewAccount na) {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(NewAccount.class);
		criteria.add(Restrictions.eq("Accountno", na.getAccountno()));
		List list = criteria.list();
		return list;

	}

}
