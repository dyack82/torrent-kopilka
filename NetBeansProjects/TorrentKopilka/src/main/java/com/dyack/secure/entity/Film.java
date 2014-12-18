package com.dyack.secure.entity;

import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film implements Serializable {  // ? Serializable

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "original_name")
    private String originalName;

    @Column(name = "released")
    private String released;

    @Column(name = "acters")
    private String acters;

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

    @Column(name = "images")
    private String images;

    @Column(name = "star")
    private float star;

    @Column(name = "quality")
    private String quality;

    @Column(name = "description")
    private String description;

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

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getActers() {
        return acters;
    }

    public void setActers(String acters) {
        this.acters = acters;
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
