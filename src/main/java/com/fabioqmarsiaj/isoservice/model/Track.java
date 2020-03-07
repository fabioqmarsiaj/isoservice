package com.fabioqmarsiaj.isoservice.model;

import org.springframework.stereotype.Component;

@Component
public class Track {

    private Integer id;
    private String name;
    private int duration;

    public Track() {}

    public Track(Integer id, String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
}
