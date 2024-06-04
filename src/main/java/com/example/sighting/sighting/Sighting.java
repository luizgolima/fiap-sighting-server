package com.example.sighting.sighting;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sightings")
@Entity(name = "sightings")
public class Sighting {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String species;
  private String description;
  private double latitude;
  private double longitude;

  public Sighting(SightingRequest data) {
    this.species = data.species();
    this.description = data.description();
    this.latitude = data.latitude();
    this.longitude = data.longitude();
  }
}
