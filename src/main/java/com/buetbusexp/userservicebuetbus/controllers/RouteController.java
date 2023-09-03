package com.buetbusexp.userservicebuetbus.controllers;

import com.buetbusexp.userservicebuetbus.payload.request.RouteAddRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.buetbusexp.userservicebuetbus.models.Route;
import com.buetbusexp.userservicebuetbus.repository.RouteRepository;


import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/routes")
public class RouteController {

    @Autowired
    private RouteRepository routeRepository;
    @PostMapping("/add-route")
    public ResponseEntity<?> addRoute(@RequestBody RouteAddRequest routeAddRequest){
        Route route = new Route();
        route.setName(routeAddRequest.getName());
        route.setDescription(routeAddRequest.getDescription());
        route.setPickupPoints(routeAddRequest.getPickupPoints());
        route.setStartPickUpPoint(routeAddRequest.getStartPickUpPoint());
        route.setEndPickUpPoint(routeAddRequest.getEndPickUpPoint());
        route.setTime(routeAddRequest.getTime());
        routeRepository.save(route);
        return ResponseEntity.ok("Route added successfully");

    }
    @GetMapping("/get-all")
    public ResponseEntity<?> getAllRoutes(){
        List<Route> routes = routeRepository.findAll();
        return ResponseEntity.ok(routes);
    }
    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getRouteById(@PathVariable Long id){
        Route route = routeRepository.findById(id).orElseThrow(() -> new RuntimeException("Route not found"));
        return ResponseEntity.ok(route);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRoute(@PathVariable Long id){
        routeRepository.deleteById(id);
        return ResponseEntity.ok("Route deleted successfully");
    }

    @PutMapping("/update-by-id/{id}")
    public ResponseEntity<?> updateRoute(@PathVariable Long id, @RequestBody RouteAddRequest routeAddRequest){
        Route route = routeRepository.findById(id).orElseThrow(() -> new RuntimeException("Route not found"));
        route.setName(routeAddRequest.getName());
        route.setDescription(routeAddRequest.getDescription());
        route.setPickupPoints(routeAddRequest.getPickupPoints());
        route.setStartPickUpPoint(routeAddRequest.getStartPickUpPoint());
        route.setEndPickUpPoint(routeAddRequest.getEndPickUpPoint());
        route.setTime(routeAddRequest.getTime());
        routeRepository.save(route);
        return ResponseEntity.ok("Route updated successfully");
    }


//    @GetMapping
//    public ResponseEntity<List<Route>> getAllRoutes() {
//        List<Route> routes = routeRepository.getAllRoutes();
//        return ResponseEntity.ok(routes);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Route> getRouteById(@PathVariable Long id) {
//        Route route = routeRepository.getRouteById(id);
//        return ResponseEntity.ok(route);
//    }

//    @PostMapping("/add-route")
//    public ResponseEntity<Route> createRoute(@RequestBody Route route) {
//        Route createdRoute = routeRepository.createRoute(route);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdRoute);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Route> updateRoute(@PathVariable Long id, @RequestBody Route route) {
//        Route updatedRoute = routeRepository.updateRoute(id, route);
//        return ResponseEntity.ok(updatedRoute);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteRoute(@PathVariable Long id) {
//        routeRepository.deleteRoute(id);
//        return ResponseEntity.noContent().build();
//    }
}