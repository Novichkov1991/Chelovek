package Chelovek;

import java.time.LocalDate;
import java.util.Date;

public class Chelovek {
    private String name;
    private LocalDate data;
    private String tel;
    private String strana;
    private String gorod;
    private String domAdres;

    public Chelovek(String name, LocalDate data, String tel, String strana, String gorod, String domAdres) {
        this.name = name;
        this.data = data;
        this.tel = tel;
        this.strana = strana;
        this.gorod = gorod;
        this.domAdres = domAdres;


    }

    public Chelovek(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStrana() {
        return strana;
    }

    public void setStrana(String strana) {
        this.strana = strana;
    }

    public String getGorod() {
        return gorod;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    public String getDomAdres() {
        return domAdres;
    }

    public void setDomAdres(String domAdres) {
        this.domAdres = domAdres;
    }

    @Override
    public String toString() {
        return "Chelovek{" +
                "name='" + name + '\'' +
                ", data=" + data +
                ", tel='" + tel + '\'' +
                ", strana='" + strana + '\'' +
                ", gorod='" + gorod + '\'' +
                ", domAdres='" + domAdres + '\'' +
                '}';
    }
}