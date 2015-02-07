package com.dyack.kopilka.entity;

import java.io.Serializable;
import java.util.List;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "producer")
public class Producer implements Serializable{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   @ManyToOne
    @JoinColumn(name = "film_id")
    private Film filmProducer;

    public Producer() {
    }

    public Producer(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Film getFilmProducer() {
//        return filmProducer;
//    }

    public void setFilmProducer(Film filmProducer) {
        this.filmProducer = filmProducer;
    }



    @Override
    public String toString() {
        return name;
    }
}
