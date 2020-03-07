package com.fabioqmarsiaj.isoservice.service;

import com.fabioqmarsiaj.isoservice.model.Album;
import com.fabioqmarsiaj.isoservice.model.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FMService {

    @Autowired
    public RestTemplate restTemplate;
    public List<Band> bands = new ArrayList<>();
    public Band band;
    public List<Album> albums = new ArrayList<>();

    public List<Band> getBands() {
        try{
            bands = getBandsFromFM();
        }catch (ResourceAccessException rE){
            rE.getMessage();
        }
        return bands;
    }

    public Band getBandById(String bandId) {
        try{
            band = getBandByIdFromFM(bandId);
        }catch (ResourceAccessException rE){
            rE.getMessage();
        }
        return band;
    }

    public List<Album> getAlbums() {
        try{
            albums = getAlbumsFromFM();
        }catch (ResourceAccessException rE){
            rE.getMessage();
        }
        return albums;
    }

    @PostMapping(value = "/bands")
    public List<Band> getBandsFromFM(){
        return restTemplate.getForObject("https://iws-recruiting-bands.herokuapp.com/api/bands", List.class);
    }

    @PostMapping(value = "/bands/{bandId}")
    public Band getBandByIdFromFM(String bandId){
        return restTemplate.postForObject("https://iws-recruiting-bands.herokuapp.com/api/bands/" + bandId, band, Band.class);
    }

    @PostMapping(value = "/albums")
    private List<Album> getAlbumsFromFM() {
        return restTemplate.getForObject("https://iws-recruiting-bands.herokuapp.com/api/albums", List.class);
    }
}
