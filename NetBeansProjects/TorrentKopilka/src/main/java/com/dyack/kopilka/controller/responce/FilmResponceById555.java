package com.dyack.kopilka.controller.responce;

//import com.dyack.kopilka.entity.Category;
import com.dyack.kopilka.entity.*;
import com.dyack.kopilka.service.ContentService;
import java.util.*;
import javax.persistence.Temporal;

public class FilmResponceById555 {

    private Film film;

    private int id;
    private String name;
    private String originalName;
    private int ageGroup;
    private int duration;
    private String description;
    private int downloadsCount;
    private String imagePrefix;
//    @Temporal(javax.persistence.TemporalType.DATE)
    private Date addDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date releaseDate;

    Category category;
    Star star;

    private List genres;
    private List<Acter> acters;
    private List producers;
    private List countrys;
    private List trailers;
    private List comments;
    private List torrents;

    public FilmResponceById555() {
    }

    public List<Object> getMinData(ContentService contentService, int id) {
        
        List<Object> resp = new ArrayList<>();
//        resp.add(contentService.getUserById(id));
        resp.add(contentService.getById(id));
        return resp;
    }

    public String getMaxData(ContentService contentService, int id) {
        film = contentService.getById(id);
        this.id = id;
        if (film == null) {
            return "NO DATA";
        }
        downloadsCount = film.getDownloadsCount();
        addDate = film.getAddDate();
        trailers = contentService.getTrailersById(id);
        comments = contentService.getCommentsById(id);
        torrents = contentService.getTorrentsById(id);

        return "{film_id=" + id + ", ageGroup=" + ageGroup + ", addDate=" + addDate + ", trailers=" + trailers
                + ", comments=" + comments + ", torrents=" + torrents + '}';
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public List getGenres() {
        return genres;
    }

    public void setGenres(List genres) {
        this.genres = genres;
    }

    public List<Acter> getActers() {
        return acters;
    }

    public void setActers(List<Acter> acters) {
        this.acters = acters;
    }

    public List getProducers() {
        return producers;
    }

    public void setProducers(List producers) {
        this.producers = producers;
    }

    public List getCountrys() {
        return countrys;
    }

    public void setCountrys(List countrys) {
        this.countrys = countrys;
    }

    public List getTrailers() {
        return trailers;
    }

    public void setTrailers(List trailers) {
        this.trailers = trailers;
    }

    public List getComments() {
        return comments;
    }

    public void setComments(List comments) {
        this.comments = comments;
    }

    public List getTorrents() {
        return torrents;
    }

    public void setTorrents(List torrents) {
        this.torrents = torrents;
    }
}
