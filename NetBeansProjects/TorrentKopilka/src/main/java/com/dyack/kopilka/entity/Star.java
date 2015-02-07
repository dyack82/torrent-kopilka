package com.dyack.kopilka.entity;

import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "star")
public class Star implements Serializable{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @Column(name = "summa")
    private int summa;

    @Column(name = "count")
    private int count;

    @Column(name = "kinopoisk")
    private String kinopoisk;

    public Star() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getKinopoisk() {
        return kinopoisk;
    }

    public void setKinopoisk(String kinopoisk) {
        this.kinopoisk = kinopoisk;
    }

    @Override
    public String toString() {
        return '{' + "summa=" + summa + ", count=" + count + ", kinopoisk=" + kinopoisk + '}';
    }

}
