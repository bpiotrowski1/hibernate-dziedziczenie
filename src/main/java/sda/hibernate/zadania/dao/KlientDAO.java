package sda.hibernate.zadania.dao;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.zadania.entity.Klient;

public class KlientDAO {
    public void create(Klient klient) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(klient);
        session.flush();
        session.close();
    }

    Klient select(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Klient klient = session.find(Klient.class, id);
        //Klient klient = session.createNativeQuery("SELECT * FROM klient WHERE ID=:id", Klient.class).setParameter("id", id).getSingleResult();
        session.flush();
        session.close();
        return klient;
    }

    Klient update(Klient klient) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Klient result = (Klient) session.merge(klient);
        session.flush();
        session.close();
        return result;
    }

    void delete(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Klient klient = new Klient();
        klient.setId(id);
        session.delete(session.contains(klient) ? klient : session.merge(klient));
        session.flush();
        session.close();
    }
}
