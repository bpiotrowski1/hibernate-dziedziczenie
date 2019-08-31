package sda.hibernate.zadania.dao;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.zadania.entity.Pracownik;

public class PracownikDAO {
    public void create(Pracownik pracownik) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(pracownik);
        session.flush();
        session.close();
    }

    Pracownik select(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Pracownik pracownik = session.find(Pracownik.class, id);
        session.flush();
        session.close();
        return pracownik;
    }

    Pracownik update(Pracownik pracownik) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Pracownik result = (Pracownik) session.merge(pracownik);
        session.flush();
        session.close();
        return result;
    }

    void delete(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Pracownik pracownik = new Pracownik();
        pracownik.setId(id);
        session.delete(session.contains(pracownik) ? pracownik : session.merge(pracownik));
        session.flush();
        session.close();
    }
}
