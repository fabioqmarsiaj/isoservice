package com.fabioqmarsiaj.isoservice.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Album {

    private Integer id;
    private String name;
    private String image;
    private Date releasedDate;
    private Band band;
    private List<Track> tracks;

    public Album() {}

    public Album(Integer id, String name, String image, Date releasedDate, Band band) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.releasedDate = releasedDate;
        this.band = band;
        this.tracks = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(Date releasedDate) {
        this.releasedDate = releasedDate;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
