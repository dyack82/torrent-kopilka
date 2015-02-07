package com.dyack.kopilka.entity;

import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "genre")
public class Genre implements Serializable, Comparable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film filmGenre;

    public Genre() {
    }

    public Genre(String name) {
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

//    public Film getFilmGenre() {
//        return filmGenre;
//    }

    public void setFilmGenre(Film filmGenre) {
        this.filmGenre = filmGenre;
    }

    @Override
    public int compareTo(Object o) {
        return -1;
    }

    @Override
    public String toString() {
        return name;
    }

}
