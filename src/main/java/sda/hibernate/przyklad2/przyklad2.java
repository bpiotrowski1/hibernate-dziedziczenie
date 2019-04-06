/*Przykład 2
 * Pokazanie jak dziala dziedziczenie table per class hierarchy*/

package sda.hibernate.przyklad2;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.entity.przyklad2.Samochod2;
import sda.hibernate.entity.przyklad2.Telefon2;

public class przyklad2 {

    public static void main(String[] arg) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Samochod2 samochod = new Samochod2();
        samochod.setMarka("opel astra");
        samochod.setCena(60000);
        samochod.setOpis("opis opla astry");
        session.persist(samochod);

        Telefon2 telefon = new Telefon2();
        telefon.setCena(3200);
        telefon.setNazwaModelu("Samsung S8");
        telefon.setOpis("calkiem niezly telefon");
        session.persist(telefon);
        session.flush();
        session.close();
    }
}
