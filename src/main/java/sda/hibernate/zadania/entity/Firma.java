package sda.hibernate.zadania.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "firma")
public class Firma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nazwa_firmy;
    @Column
    private String imie;
    @Column
    private String nazwisko;

    public Firma() {
    }

    public Firma(final String nazwa_firmy, final String imie, final String nazwisko) {
        this.nazwa_firmy = nazwa_firmy;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa_firmy() {
        return nazwa_firmy;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
