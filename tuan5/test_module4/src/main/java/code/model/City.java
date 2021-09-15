package code.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "not null")
    private String nameCity;
    @ManyToOne
    private Country country;

    private int area;

    private int danSo;

    private int GDP;

    private String moTa;

    public City(){}

    public City(long id, String nameCity, Country country, int area, int danSo, int GDP, String moTa) {
        this.id = id;
        this.nameCity = nameCity;
        this.country = country;
        this.area = area;
        this.danSo = danSo;
        this.GDP = GDP;
        this.moTa = moTa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public int getGDP() {
        return GDP;
    }

    public void setGDP(int GDP) {
        this.GDP = GDP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
