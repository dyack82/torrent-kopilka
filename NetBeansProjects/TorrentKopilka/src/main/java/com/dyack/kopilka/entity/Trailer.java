package com.dyack.kopilka.entity;

import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "trailer")
public class Trailer implements Serializable, Comparable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @Column(name = "link")
    private String link;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film filmTrailer;

    public Trailer() {
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Film getFilmTrailer() {
//        return filmTrailer;
//    }

    public void setFilmTrailer(Film filmTrailer) {
        this.filmTrailer = filmTrailer;
    }

    @Override
    public String toString() {
        return '{' + "link=" + link + ", description=" + description + '}';
    }

    @Override
    public int compareTo(Object o) {
        return -1;
    }

}
