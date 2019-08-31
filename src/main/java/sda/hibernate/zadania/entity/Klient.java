package sda.hibernate.zadania.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("klient")
public class Klient extends Firma {
    @Column
    private String telefon;

    public Klient() {
    }

    public Klient(final String nazwa_firmy, final String imie, final String nazwisko, final String telefon) {
        super(nazwa_firmy, imie, nazwisko);
        this.telefon = telefon;
    }
}
