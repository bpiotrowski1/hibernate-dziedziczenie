package sda.hibernate.entity.przyklad4;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "produkt4")
public class Produkt4 {
    @Id
    @TableGenerator(
            name = "SHAPE_GEN",
            table = "ID_Generator",
            pkColumnName = "name",
            valueColumnName = "sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SHAPE_GEN")
    private Long id;

    @Column
    private String opis;
    @Column
    private Integer cena;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }
}
