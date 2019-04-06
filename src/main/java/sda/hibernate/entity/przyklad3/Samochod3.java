package sda.hibernate.entity.przyklad3;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("samochod3")
public class Samochod3 extends Produkt3 {
    @Column
    private String marka;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
