package com.dyack.kopilka.controller.responce;

public class FilmResponce {
        
        private long id;
        private String name;
        private String year;
        private String country;
        private String regisser;
        private String genre;
        private String age_viewers;
        private String time_duration;

    public FilmResponce() {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
