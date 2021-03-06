package com.dyack.kopilka.entity;

import java.io.Serializable;
import java.util.List;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film filmCountry;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Film getFilmCountry() {
//        return filmCountry;
//    }

    public void setFilmCountry(Film filmCountry) {
        this.filmCountry = filmCountry;
    }

    @Override
    public String toString() {
        return name;
    }

}
