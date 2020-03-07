package com.fabioqmarsiaj.isoservice.service;

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
    public List<Band> bandList = new ArrayList<>();
    public Band band;

    public List<Band> getBands() {
        try{
            bandList = getBandsFromFM();
        }catch (ResourceAccessException rE){
            rE.getMessage();
        }
        return bandList;
    }

    public Band getBandById(String bandId) {
        try{
            band = getBandByIdFromFM(bandId);
        }catch (ResourceAccessException rE){
            rE.getMessage();
        }
        return band;
    }

    @PostMapping(value = "/bands")
    public List<Band> getBandsFromFM(){
        return restTemplate.getForObject("https://iws-recruiting-bands.herokuapp.com/api/bands", List.class);
    }

    @PostMapping(value = "/bands/{bandId}")
    public Band getBandByIdFromFM(String bandId){
        return restTemplate.postForObject("https://iws-recruiting-bands.herokuapp.com/api/bands/" + bandId, band, Band.class);
    }
}
