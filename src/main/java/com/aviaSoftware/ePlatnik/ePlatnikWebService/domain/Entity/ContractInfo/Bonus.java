package com.aviaSoftware.ePlatnik.ePlatnikWebService.domain.Entity.ContractInfo;

import javax.persistence.*;

@Entity
@Table(name = "BONUS")
public class Bonus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String typeBonus;
    private Double value;
    private Double percentBonus;
    private String itemBonus;

    public String getTypeBonus() {
        return typeBonus;
    }

    public void setTypeBonus(String typeBonus) {
        this.typeBonus = typeBonus;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getPercentBonus() {
        return percentBonus;
    }

    public void setPercentBonus(Double percentBonus) {
        this.percentBonus = percentBonus;
    }

    public String getItemBonus() {
        return itemBonus;
    }

    public void setItemBonus(String itemBonus) {
        this.itemBonus = itemBonus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
