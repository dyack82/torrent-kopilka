package com.dyack.kopilka.entity;

import java.io.Serializable;
import java.util.*;
import java.util.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "film")
public class Film implements Serializable{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "original_name")
    private String originalName;

    @Column(name = "age_group")
    private int ageGroup;

    @Column(name = "duration")
    private int duration;

    @Column(name = "description")
    private String description;
    
    @Column(name = "downloads_count")
    private int downloadsCount;
    
    @Column(name = "image_prefix")
    private String imagePrefix;
    
    @Column(name = "add_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date addDate;

    @Column(name = "release_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date releaseDate;
    
    @OneToOne
    @JoinColumn(name = "category_id")
    Category category;
    
    @OneToOne
    @JoinColumn(name = "star_id")
    Star star;
    
    @OneToMany(targetEntity = Genre.class, mappedBy = "filmGenre", fetch = FetchType.EAGER) // tolko LAZI - genres v etom toString vizvat nelzya
    @Embedded
    private Set<Genre> genres;

    @OneToMany(targetEntity = Acter.class, mappedBy = "filmActer", fetch = FetchType.EAGER) // esli LAZY - to acters.toString ne rabotaet
    @Embedded 
    private Set<Acter> acters;
    
    @OneToMany(targetEntity = Producer.class, mappedBy = "filmProducer", fetch = FetchType.EAGER) 
    @Embedded
    private Set producers;
    
    @OneToMany(targetEntity = Country.class, mappedBy = "filmCountry", fetch = FetchType.EAGER) 
    @Embedded
    private Set countrys;
    
    @OneToMany(targetEntity = Trailer.class, mappedBy = "filmTrailer", fetch = FetchType.EAGER) 
    @Embedded
    private Set trailers;
    
    @OneToMany(targetEntity = Comment.class, mappedBy = "filmComment", fetch = FetchType.EAGER) 
    @Embedded
    private Set comments;
    
    @OneToMany(targetEntity = Torrent.class, mappedBy = "filmTorrent", fetch = FetchType.EAGER) 
    @Embedded
    private List torrents;

    public Film() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDownloadsCount() {
        return downloadsCount;
    }

    public void setDownloadsCount(int downloadsCount) {
        this.downloadsCount = downloadsCount;
    }

    public String getImagePrefix() {
        return imagePrefix;
    }

    public void setImagePrefix(String imagePrefix) {
        this.imagePrefix = imagePrefix;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Set<Acter> getActers() {
        return acters;
    }

    public void setActers(Set<Acter> acters) {
        this.acters = acters;
    }

    public Set getProducers() {
        return producers;
    }

    public void setProducers(Set producers) {
        this.producers = producers;
    }

    public Set getCountrys() {
        return countrys;
    }

    public void setCountrys(Set countrys) {
        this.countrys = countrys;
    }

    public Set getTrailers() {
        return trailers;
    }

    public void setTrailers(Set trailers) {
        this.trailers = trailers;
    }

    public Set getComments() {
        return comments;
    }

    public void setComments(Set comments) {
        this.comments = comments;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List getTorrents() {
        return torrents;
    }

    public void setTorrents(List torrents) {
        this.torrents = torrents;
    }

    @Override
    public String toString() {
        return '{' + "-id=" + id + ", name=" + name + ", originalName=" + originalName + 
                ", ageGroup=" + ageGroup + ", duration=" + duration + ", description=" + description + ", "
                + "downloadsCount=" + downloadsCount + ", imagePrefix=" + imagePrefix + ", "
                + "addDate=" + addDate + ", releaseDate=" + releaseDate + "\ncategory=" + category + ", star=" + star +
                "\nacters=" + acters + ",\ngenres=" + genres + '}';
    }

//    @Override
//    public String toString() {
//        return "Film{" + "id=" + id + ", name=" + name + ", originalName=" + originalName + 
//                "\nageGroup=" + ageGroup + ", duration=" + duration + ", description=" + description + 
//                "\ndownloadsCount=" + downloadsCount + ", imagePrefix=" + imagePrefix + 
//                "\naddDate=" + addDate + ", releaseDate=" + releaseDate + ", category=" + category + 
//                "\nstar=" + star + ", genres=" + genres + ", acters=" + acters + ", producers=" + producers + 
//                "\ncountrys=" + countrys + ", trailers=" + trailers + ", comments=" + comments + 
//                "\ntorrents=" + torrents + '}';
//    }




    
    

}
