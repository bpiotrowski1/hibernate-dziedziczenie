package sda.hibernate.zadania;

import sda.hibernate.zadania.dao.FirmaDAO;
import sda.hibernate.zadania.dao.KlientDAO;
import sda.hibernate.zadania.dao.PracownikDAO;
import sda.hibernate.zadania.entity.Klient;
import sda.hibernate.zadania.entity.Pracownik;

public class Zadanie1 {
    public static void main(String[] args) {
        PracownikDAO pracownikDAO = new PracownikDAO();
        KlientDAO klientDAO = new KlientDAO();

        Klient klient = new Klient("Firma1","Imie1", "Naziwsko1", "123456789");
        Pracownik pracownik = new Pracownik("Firma2", "Imie2", "Naziwsko2", "stanowisko1", 5000.0);

        pracownikDAO.create(pracownik);
        klientDAO.create(klient);

        //2
        FirmaDAO firmaDAO = new FirmaDAO();
        System.out.println(firmaDAO.findById(1).getImie() + " " + firmaDAO.findById(1).getNazwisko());
    }
}
