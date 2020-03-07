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

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public Band getBand() {
        return band;
    }

    public List<Track> getTracks() {
        return tracks;
    }
}
