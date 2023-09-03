package com.buetbusexp.userservicebuetbus.controllers;
import com.buetbusexp.userservicebuetbus.repository.PickUpPointsRepository;
import com.buetbusexp.userservicebuetbus.models.PickUpPoints;
import com.buetbusexp.userservicebuetbus.payload.request.PickUpPointsAddRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/pickuppoints")
public class PickUpPointsController {

    @Autowired
    private PickUpPointsRepository pickUpPointsRepository;

    @PostMapping("/addpickuppoints")
    public ResponseEntity<?> addpickupPoints(@RequestBody PickUpPointsAddRequest pickUpPointsAddRequest) {
        PickUpPoints pickUpPoints = new PickUpPoints();
        pickUpPoints.setRoute(pickUpPointsAddRequest.getRoute());
        pickUpPoints.setName(pickUpPointsAddRequest.getName());
        pickUpPoints.setLatitude(pickUpPointsAddRequest.getLatitude());
        pickUpPoints.setLongitude(pickUpPointsAddRequest.getLongitude());
        pickUpPoints.setTime(pickUpPointsAddRequest.getTime());

        pickUpPointsRepository.save(pickUpPoints);

        return ResponseEntity.ok("PickUpPoints added successfully!");

    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllPickUpPoints() {
        List<PickUpPoints> pickUpPoints = pickUpPointsRepository.findAll();
        return ResponseEntity.ok(pickUpPoints);
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getPickUpPointsById(@PathVariable Long id) {
        PickUpPoints pickUpPoints = pickUpPointsRepository.findById(id).orElseThrow(() -> new RuntimeException("PickUpPoints not found"));
        return ResponseEntity.ok(pickUpPoints);
    }

    @GetMapping("/get-by-route/{routeId}")
    public ResponseEntity<?> getPickUpPointsByRoute(@PathVariable Long routeId) {
        List<PickUpPoints> pickUpPoints = pickUpPointsRepository.findbyRouteId(routeId);
        return ResponseEntity.ok(pickUpPoints);
    }


//        @GetMapping("/{id}")
//        public ResponseEntity<PickUpPoints> getPickUpPointsById (@PathVariable Long id){
//            PickUpPoints pickUpPoints = pickUpPointsService.getPickUpPointsById(id);
//            return ResponseEntity.ok(pickUpPoints);
//        }
//
//        @PostMapping
//        public ResponseEntity<PickUpPoints> createPickUpPoints (@RequestBody PickUpPoints pickUpPoints){
//            PickUpPoints createdPickUpPoints = pickUpPointsService.createPickUpPoints(pickUpPoints);
//            return ResponseEntity.status(HttpStatus.CREATED).body(createdPickUpPoints);
//        }
//
//        @PutMapping("/{id}")
//        public ResponseEntity<PickUpPoints> updatePickUpPoints (@PathVariable Long id, @RequestBody PickUpPoints
//        pickUpPoints){
//            PickUpPoints updatedPickUpPoints = pickUpPointsService.updatePickUpPoints(id, pickUpPoints);
//            return ResponseEntity.ok(updatedPickUpPoints);
//        }
//
//        @DeleteMapping("/{id}")
//        public ResponseEntity<Void> deletePickUpPoints (@PathVariable Long id){
//            pickUpPointsService.deletePickUpPoints(id);
//            return ResponseEntity.noContent().build();
//        }
    }
