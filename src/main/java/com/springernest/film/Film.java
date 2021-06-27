package com.springernest.film;

public class Film {
    String title;
    Integer durationInMins;

    public Film(String title, Integer durationInMins) {
        this.title = title;
        this.durationInMins = durationInMins;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDurationInMins() {
        return durationInMins;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
