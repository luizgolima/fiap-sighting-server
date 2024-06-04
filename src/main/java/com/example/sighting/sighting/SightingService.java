package com.example.sighting.sighting;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SightingService {

  @Autowired private SightingRepository repository;

  public List<SightingResponse> findAll() {
    return repository.findAll().stream().map(SightingResponse::new).toList();
  }

  public void save(SightingRequest data) {
    repository.save(new Sighting(data));
  }
}
