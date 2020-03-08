package com.fabioqmarsiaj.isoservice.service;

import com.fabioqmarsiaj.isoservice.exception.BandNotFoundException;
import com.fabioqmarsiaj.isoservice.model.Album;
import com.fabioqmarsiaj.isoservice.model.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class FMService {

    @Autowired
    public RestTemplate restTemplate;
    public List<Band> bands = new ArrayList<>();
    public Band band;
    public List<Album> albums = new ArrayList<>();

    @Cacheable("bands")
    public List<Band> getBands() {
        try{
            bands = getBandsFromFM();
        }catch (ResourceAccessException rE){
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "The correct endpoint for getting Bands is https://isoservice.herokuapp.com/fmservice/bands", rE);
        }
        return bands;
    }

    @Cacheable("band")
    public Band getBandById(String bandId) {
        try{
            band = getBandByIdFromFM(bandId);
        }catch (BandNotFoundException bandNotFoundException){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Band Not Found", bandNotFoundException);
        }
        return band;
    }

    @Cacheable("albums")
    public List<Album> getAlbums() {
        try{
            albums = getAlbumsFromFM();
        }catch (ResourceAccessException rE){
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "The correct endpoint for getting Albums is https://isoservice.herokuapp.com/fmservice/albums", rE);
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
