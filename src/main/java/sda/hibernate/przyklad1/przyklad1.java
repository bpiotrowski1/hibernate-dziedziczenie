/*Przykład 2
 * Pokazanie jak dziala dziedziczenie table per class hierarchy*/

package sda.hibernate.przyklad1;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;
import sda.hibernate.entity.przyklad1.Samochod1;
import sda.hibernate.entity.przyklad1.Telefon1;

public class przyklad1 {

    public static void main(String[] arg) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Samochod1 samochod = new Samochod1();
        samochod.setMarka("opel astra");
        samochod.setCena(60000);
        samochod.setOpis("opis opla astry");
        session.persist(samochod);

        Telefon1 telefon = new Telefon1();
        telefon.setCena(3200);
        telefon.setNazwaModelu("Samsung S8");
        telefon.setOpis("calkiem niezly telefon");
        session.persist(telefon);
        session.flush();
        session.close();
    }
}
