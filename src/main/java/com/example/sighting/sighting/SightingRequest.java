package com.example.sighting.sighting;

public record SightingRequest(
    String species, String description, double latitude, double longitude) {}
