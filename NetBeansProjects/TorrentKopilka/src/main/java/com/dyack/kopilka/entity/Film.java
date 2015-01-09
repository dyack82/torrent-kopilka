package com.dyack.kopilka.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film implements Serializable {  // ? Serializable

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "film_id", length = 6, nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "original_name")
    private String originalName;

    @Column(name = "age_group")
    private Integer age_group;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "description")
    private String description;

    @Column(name = "add_date")
    private Date add_date;

    @Column(name = "release_date")
    private Date release_date;

    @Column(name = "downloads_count")
    private Integer downloads_count;

//    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "category_category_id")
    private Integer category_category_id;

    @Column(name = "image_image_id")
    private Integer image_image_id;

    @Column(name = "star_star_id")
    private Integer star_star_id;

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

    public Integer getAge_group() {
        return age_group;
    }

    public void setAge_group(Integer age_group) {
        this.age_group = age_group;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public Integer getDownloads_count() {
        return downloads_count;
    }

    public void setDownloads_count(Integer downloads_count) {
        this.downloads_count = downloads_count;
    }

    public Integer getCategory_category_id() {
        return category_category_id;
    }

    public void setCategory_category_id(Integer category_category_id) {
        this.category_category_id = category_category_id;
    }

    public Integer getImage_image_id() {
        return image_image_id;
    }

    public void setImage_image_id(Integer image_image_id) {
        this.image_image_id = image_image_id;
    }

    public Integer getStar_star_id() {
        return star_star_id;
    }

    public void setStar_star_id(Integer star_star_id) {
        this.star_star_id = star_star_id;
    }


}
