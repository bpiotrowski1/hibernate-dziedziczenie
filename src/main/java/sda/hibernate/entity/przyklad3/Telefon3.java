package sda.hibernate.entity.przyklad3;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("telefon3")
@PrimaryKeyJoinColumn(name = "produktID")
public class Telefon3 extends Produkt3 {
    @Column
    private String nazwaModelu;

    public String getNazwaModelu() {
        return nazwaModelu;
    }

    public void setNazwaModelu(String nazwaModelu) {
        this.nazwaModelu = nazwaModelu;
    }
}
