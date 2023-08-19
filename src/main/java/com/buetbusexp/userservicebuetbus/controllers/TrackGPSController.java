package com.buetbusexp.userservicebuetbus.controllers;

import com.buetbusexp.userservicebuetbus.models.Bus;
import com.buetbusexp.userservicebuetbus.models.TrackGPS;
//import com.buetbusexp.userservicebuetbus.payload.request.TimestampRangeRequest;
import com.buetbusexp.userservicebuetbus.payload.request.trackGPSAddRequest;
import com.buetbusexp.userservicebuetbus.repository.BusRepository;
import com.buetbusexp.userservicebuetbus.repository.TrackGPSRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/trackGPS")
public class TrackGPSController {

    @Autowired
    private TrackGPSRepository trackGPSRepository;

    @PostMapping("/addGPS")
    public ResponseEntity<?> addTrack(@RequestBody @Valid trackGPSAddRequest trackgpsRequest
        // Add logic to store track data in the database
    ) {
        TrackGPS track = new TrackGPS();
        track.setBus(trackgpsRequest.getBus());
        track.setLatitude(trackgpsRequest.getLatitude());
        track.setLongitude(trackgpsRequest.getLongitude());
        track.setSpeed(trackgpsRequest.getSpeed());
        track.setTimestamp(trackgpsRequest.getTimestamp());

        trackGPSRepository.save(track);
        return ResponseEntity.ok("TrackGPS added successfully!");
    }

//    @PostMapping("/addGPS")
//    public ResponseEntity<?> addTrack(@RequestBody TrackGPS track) {
//        // Assuming trackRepository is your repository for TrackGPS
//
//        // Add logic to store track data in the database
//
//        Bus bus = BusRepository.findById(track.getId())
//                .orElseThrow(() -> new RuntimeException("Bus not found"));
//
//        track.setBus(bus);
//        trackGPSRepository.save(track);
//
//        return ResponseEntity.ok("TrackGPS added successfully!");
//    }


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

//    @GetMapping("/getTracksInTimestampRange")
//    public String allAccesss() {
//        return "Public Content.";
//    }
//    public ResponseEntity<List<TrackGPS>> getTracksInTimestampRange(
//            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date startTime,
//            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date endTime) {
//
//        List<TrackGPS> tracksInTimestampRange = trackGPSRepository.findByTimestampBetween(startTime, endTime);
//
//        return ResponseEntity.ok(tracksInTimestampRange);
//
//    }

    @GetMapping("/getTracksInTimestampRange")
    public ResponseEntity<List<TrackGPS>> getTracksInTimestampRange(

            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS") Date startTime,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS") Date endTime) {

        List<TrackGPS> tracksInTimestampRange = trackGPSRepository.findByTimestampBetween(startTime, endTime);

        return ResponseEntity.ok(tracksInTimestampRange);
    }

//    @PostMapping("/getTracksInTimestampRange")
//    public ResponseEntity<List<TrackGPS>> getTracksInTimestampRange(
//            @RequestBody TimestampRangeRequest timestampRangeRequest) {
//
//        Date startTime = timestampRangeRequest.getStartTime();
//        Date endTime = timestampRangeRequest.getEndTime();
//
//        List<TrackGPS> tracksInTimestampRange = trackGPSRepository.findByTimestampBetween(startTime, endTime);
//
//        return ResponseEntity.ok(tracksInTimestampRange);
//    }
}
