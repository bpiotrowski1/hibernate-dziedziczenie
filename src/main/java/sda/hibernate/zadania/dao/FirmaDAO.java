package sda.hibernate.zadania.dao;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.zadania.entity.Firma;

import java.util.List;

public class FirmaDAO {
    public Firma findById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Firma firma = session.createQuery("FROM Firma WHERE ID=:id", Firma.class).setParameter("id", id).getSingleResult();
        session.flush();
        session.close();
        return firma;
    }

    public List<Firma> findByNazwisko(String nazwisko) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Firma> result = session.createQuery("FROM Firma WHERE nazwisko like :nazwisko", Firma.class).setParameter("nazwisko", nazwisko).getResultList();
        session.flush();
        session.close();
        return result;
    }
}
