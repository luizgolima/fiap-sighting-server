package com.example.sighting.sighting;

public record SightingResponse(
    Long id, String species, String description, double latitude, double longitude) {
  public SightingResponse(Sighting sighting) {
    this(
        sighting.getId(),
        sighting.getSpecies(),
        sighting.getDescription(),
        sighting.getLatitude(),
        sighting.getLongitude());
  }
}
