package com.buetbusexp.userservicebuetbus.controllers;

import com.buetbusexp.userservicebuetbus.models.Bus;
import com.buetbusexp.userservicebuetbus.models.TrackGPS;
import com.buetbusexp.userservicebuetbus.repository.BusRepository;
import com.buetbusexp.userservicebuetbus.repository.TrackGPSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/trackGPS")
public class TrackGPSController {

    @Autowired
    private TrackGPSRepository trackGPSRepository;

//    @PostMapping("/addGPS")
//    public ResponseEntity<?> addTrack(@RequestBody TrackGPS track) {
//        // Add logic to store track data in the database
//        trackGPSRepository.save(track);
//        return ResponseEntity.ok("TrackGPS added successfully!");
//    }

    @PostMapping("/addGPS")
    public ResponseEntity<?> addTrack(@RequestBody TrackGPS track) {
        // Assuming trackRepository is your repository for TrackGPS

        // Add logic to store track data in the database

        Bus bus = BusRepository.findById(track.getId())
                .orElseThrow(() -> new RuntimeException("Bus not found"));

        track.setBus(bus);
        trackGPSRepository.save(track);

        return ResponseEntity.ok("TrackGPS added successfully!");
    }


    @GetMapping("/get-all")
    public ResponseEntity<?> getAllTracks() {
        List<TrackGPS> tracks = trackGPSRepository.findAll();
        return ResponseEntity.ok(tracks);
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getTrackById(@PathVariable Long id) {
        TrackGPS trackGPS = trackGPSRepository.findById(id).orElse(null);
        if (trackGPS != null) {
            return ResponseEntity.ok(trackGPS);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/get-by-bus/{busId}")
    public ResponseEntity<?> getTracksByBusId(@PathVariable Long busId) {
        List<TrackGPS> tracks = trackGPSRepository.findByBusId(busId);
        return ResponseEntity.ok(tracks);
    }
}
