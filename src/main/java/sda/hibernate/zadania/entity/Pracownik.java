package sda.hibernate.zadania.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("pracownik")
public class Pracownik extends Firma {
    @Column
    private String stanowisko;
    @Column
    private Double wynagrodzenie;

    public Pracownik() {}

    public Pracownik(final String nazwa_firmy, final String imie, final String nazwisko, final String stanowisko, final Double wynagrodzenie) {
        super(nazwa_firmy, imie, nazwisko);
        this.stanowisko = stanowisko;
        this.wynagrodzenie = wynagrodzenie;
    }
}
