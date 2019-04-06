package sda.hibernate.entity.przyklad2;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("telefon")
public class Telefon2 extends Produkt2 {
    @Column
    private String nazwaModelu;

    public String getNazwaModelu() {
        return nazwaModelu;
    }

    public void setNazwaModelu(String nazwaModelu) {
        this.nazwaModelu = nazwaModelu;
    }
}
