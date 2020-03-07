package com.fabioqmarsiaj.isoservice.model;

import org.springframework.stereotype.Component;

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

    public Band(Integer id, String name, String image, String genre, String biography, int numPlays, List<Album> albums) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.genre = genre;
        this.biography = biography;
        this.numPlays = numPlays;
        this.albums = albums;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public int getNumPlays() {
        return numPlays;
    }

    public void setNumPlays(int numPlays) {
        this.numPlays = numPlays;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
