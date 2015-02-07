package com.dyack.kopilka.entity;

import java.io.Serializable;
import java.util.List;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "acter")
public class Acter implements Serializable, Comparable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @Column(name = "name")
    private String nameActer;

    
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film filmActer;


    public Acter() {
    }

    public Acter(String nameActer) {
        this.nameActer = nameActer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameActer() {
        return nameActer;
    }

    public void setNameActer(String nameActer) {
        this.nameActer = nameActer;
    }



//    public Film getFilmActer() {
//        return filmActer;
//    }
//
    public void setFilmActer(Film filmActer) {
        this.filmActer = filmActer;
    }

    @Override
    public String toString() {
        return nameActer;
    }

    @Override
    public int compareTo(Object o) {
        return -1;
    }
    
    

}
