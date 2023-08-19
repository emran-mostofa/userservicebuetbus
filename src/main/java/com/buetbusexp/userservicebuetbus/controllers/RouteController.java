//package com.buetbusexp.userservicebuetbus.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import com.buetbusexp.userservicebuetbus.models.Route;
//import com.buetbusexp.userservicebuetbus.repository.RouteRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/routes")
//public class RouteController {
//
//    @Autowired
//    private RouteRepository routeRepository;
//
//    // Get list of all routes
//    @GetMapping
//    public ResponseEntity<List<Route>> getAllRoutes() {
//        List<Route> routes = routeRepository.findAll();
//        return new ResponseEntity<>(routes, HttpStatus.OK);
//    }
//
//    // Get list of active routes
//    @GetMapping("/active")
//    public ResponseEntity<List<Route>> getActiveRoutes() {
//        List<Route> routes = routeRepository.findByIsActive(true);
//        return new ResponseEntity<>(routes, HttpStatus.OK);
//    }
//
//    // Search routes based on various criteria
////    @GetMapping("/search")
////    public ResponseEntity<List<Route>> searchRoutes(
////            @RequestParam(required = false) String origin,
////            @RequestParam(required = false) String destination,
////            @RequestParam(required = false) String driverName,
////            @RequestParam(required = false) String vehicleNumber,
////            @RequestParam(required = false) String keyword
////    ) {
////        List<Route> routes = routeRepository.findByOriginAndDestinationAndDriverNameAndVehicleNumberAndDescriptionContainingAndIsActive(
////                origin, destination, driverName, vehicleNumber, keyword, true);
////        return new ResponseEntity<>(routes, HttpStatus.OK);
////    }
//
//    // Get route by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Route> getRouteById(@PathVariable Long id) {
//        Optional<Route> routeOptional = routeRepository.findByIdAndIsActive(id, true);
//        return routeOptional.map(route -> new ResponseEntity<>(route, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    // Create a new route with pickup points and timings
//    @PostMapping
//    public ResponseEntity<Route> createRoute(@RequestBody Route route) {
//        Route savedRoute = routeRepository.save(route);
//        return new ResponseEntity<>(savedRoute, HttpStatus.CREATED);
//    }
//
//    // Update route details including pickup points and timings
////    @PutMapping("/{id}")
////    public ResponseEntity<Route> updateRoute(@PathVariable Long id, @RequestBody Route routeDetails) {
////        Optional<Route> routeOptional = routeRepository.findByIdAndIsActive(id, true);
////        if (routeOptional.isPresent()) {
////            Route route = routeOptional.get();
////            updateRouteWithNewFields(route, routeDetails);
////            Route updatedRoute = routeRepository.save(route);
////            return new ResponseEntity<>(updatedRoute, HttpStatus.OK);
////        } else {
////            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
////        }
////    }
//
//    // Delete route by ID
////    @DeleteMapping("/{id}")
////    public ResponseEntity<HttpStatus> deleteRoute(@PathVariable Long id) {
////        Optional<Route> routeOptional = routeRepository.findByIdAndIsActive(id, true);
////        if (routeOptional.isPresent()) {
////            Route route = routeOptional.get();
////            route.setActive(false);
////            routeRepository.save(route);
////            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
////        } else {
////            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
////        }
////    }
//
//    // Update the Route object with new fields from the request
////    private void updateRouteWithNewFields(Route route, Route routeDetails) {
////        route.setName(routeDetails.getName());
////        route.setDescription(routeDetails.getDescription());
////        route.setOrigin(routeDetails.getOrigin());
////        route.setPickupPoints(routeDetails.getPickupPoints());
////        route.setPickupTimings(routeDetails.getPickupTimings());
////        route.setDriverName(routeDetails.getDriverName());
////        route.setVehicleNumber(routeDetails.getVehicleNumber());
////        route.setSchedule(routeDetails.getSchedule());
////        route.setEndPoint(routeDetails.getEndPoint());
////        route.setEndTiming(routeDetails.getEndTiming());
////        route.setPickingUpBusTiming(routeDetails.getPickingUpBusTiming());
////        route.setNoonLeavingBusTiming(routeDetails.getNoonLeavingBusTiming());
////        route.setEveningLeavingBusTiming(routeDetails.getEveningLeavingBusTiming());
////        // Update other fields as needed
////    }
//}
