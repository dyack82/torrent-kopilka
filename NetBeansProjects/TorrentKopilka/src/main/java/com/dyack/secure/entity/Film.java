package com.dyack.secure.entity;

import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "released")
    private String released;
    
    @Column(name = "country")
    private String country;
    
    @Column(name = "regisser")
    private String regisser;
    
    @Column(name = "genre")
    private String genre;
    
    @Column(name = "age_viewers")
    private String age_viewers;
    
    @Column(name = "time_duration")
    private String time_duration;

    public Film() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegisser() {
        return regisser;
    }

    public void setRegisser(String regisser) {
        this.regisser = regisser;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAge_viewers() {
        return age_viewers;
    }

    public void setAge_viewers(String age_viewers) {
        this.age_viewers = age_viewers;
    }

    public String getTime_duration() {
        return time_duration;
    }

    public void setTime_duration(String time_duration) {
        this.time_duration = time_duration;
    }
    
    

}
