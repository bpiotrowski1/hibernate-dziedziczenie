package sda.hibernate.entity.przyklad1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("telefon1")
public class Telefon1 extends Produkt1{
    @Column
    private String nazwaModelu;

    public String getNazwaModelu() {
        return nazwaModelu;
    }

    public void setNazwaModelu(String nazwaModelu) {
        this.nazwaModelu = nazwaModelu;
    }
}
