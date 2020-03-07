package com.fabioqmarsiaj.isoservice.controller;

import com.fabioqmarsiaj.isoservice.model.Album;
import com.fabioqmarsiaj.isoservice.model.Band;
import com.fabioqmarsiaj.isoservice.service.FMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RestController
@EnableAutoConfiguration
@RequestMapping("/fmservice")
public class FMController {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public FMService fmService;

    @RequestMapping(value = "/bands")
    @ResponseBody
    public ResponseEntity<List<Band>> getBands(){
        return ResponseEntity.ok(fmService.getBands());
    }

    @PostMapping(value = "/bands/{bandId}")
    @ResponseBody
    public ResponseEntity<Band> getBandById(@PathVariable(value = "bandId") String bandId){
        return ResponseEntity.ok(fmService.getBandById(bandId));
    }

    @RequestMapping(value = "/albums")
    @ResponseBody
    public ResponseEntity<List<Album>> getAlbums(){
        return ResponseEntity.ok(fmService.getAlbums());
    }
}
