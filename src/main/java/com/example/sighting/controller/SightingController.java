package com.example.sighting.controller;

import com.example.sighting.sighting.SightingRequest;
import com.example.sighting.sighting.SightingResponse;
import com.example.sighting.sighting.SightingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sightings")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SightingController {

  @Autowired private SightingService service;

  @GetMapping
  public List<SightingResponse> findAll() {
    return service.findAll();
  }

  @PostMapping
  public void save(@RequestBody SightingRequest data) {
    service.save(data);
  }
}
