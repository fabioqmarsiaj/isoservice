package com.fabioqmarsiaj.isoservice.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Band {

    private Integer id;
    private String name;
    private String image;
    private String genre;
    private String biography;
    private int numPlays;
    private List<Album> albums;

    public Band() {}

    public Band(Integer id, String name, String image, String genre, String biography, int numPlays) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.genre = genre;
        this.biography = biography;
        this.numPlays = numPlays;
        this.albums = new ArrayList<>();
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

    public String getGenre() {
        return genre;
    }

    public String getBiography() {
        return biography;
    }

    public int getNumPlays() {
        return numPlays;
    }

    public List<Album> getAlbums() {
        return albums;
    }
}
