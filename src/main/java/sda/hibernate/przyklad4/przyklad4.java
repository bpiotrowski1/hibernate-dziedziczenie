/*Przykład 4
 * Pokazanie jak dziala dziedziczenie table per concrete class*/

package sda.hibernate.przyklad4;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.entity.przyklad4.Samochod4;
import sda.hibernate.entity.przyklad4.Telefon4;

public class przyklad4 {

    public static void main(String[] arg) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Samochod4 samochod = new Samochod4();
        samochod.setMarka("opel astra");
        samochod.setCena(60000);
        samochod.setOpis("opis opla astry");
        session.persist(samochod);

        Telefon4 telefon = new Telefon4();
        telefon.setCena(3200);
        telefon.setNazwaModelu("Samsung S8");
        telefon.setOpis("calkiem niezly telefon");
        session.persist(telefon);
        session.flush();
        session.close();

/*        session = HibernateUtil.getSessionFactory().openSession();
        session.createQuery("FROM Produkt4",Produkt4.class).getResultList().get(0);
        session.close();*/
    }
}
