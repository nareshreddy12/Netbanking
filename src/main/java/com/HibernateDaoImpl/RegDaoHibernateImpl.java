package com.HibernateDaoImpl;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

import com.DaoInterfaces.IfRegDao;
import com.pojo.NewAccount;

@Repository
public class RegDaoHibernateImpl implements IfRegDao {
	private final static Logger logger = Logger.getLogger(RegDaoHibernateImpl.class);
	static SessionFactory sf;
	static {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	public Serializable save(NewAccount na) {
		Session session = sf.openSession();
		try {
			Serializable save = session.save(na);
			session.beginTransaction().commit();
			return save;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("duplicate entity");

			return null;
		}
	}

}
