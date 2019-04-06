package sda.hibernate.entity.przyklad4;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Telefon4 extends Produkt4 {
    @Column
    private String nazwaModelu;

    public String getNazwaModelu() {
        return nazwaModelu;
    }

    public void setNazwaModelu(String nazwaModelu) {
        this.nazwaModelu = nazwaModelu;
    }
}
