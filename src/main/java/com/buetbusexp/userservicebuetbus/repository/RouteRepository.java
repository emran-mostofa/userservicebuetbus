package com.buetbusexp.userservicebuetbus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.buetbusexp.userservicebuetbus.models.Route;

import java.util.List;
import java.util.Optional;

public interface RouteRepository extends JpaRepository<Route, Long> {

    List<Route> findByIsActive(boolean isActive);

    List<Route> findByOriginAndDestinationAndIsActive(String origin, String destination, boolean isActive);

    List<Route> findByDriverNameAndIsActive(String driverName, boolean isActive);

    List<Route> findByVehicleNumberAndIsActive(String vehicleNumber, boolean isActive);

    List<Route> findByDescriptionContainingAndIsActive(String keyword, boolean isActive);

    Optional<Route> findByIdAndIsActive(Long id, boolean isActive);

    List<Route> findByPickupPointsContainingAndIsActive(String pickupPoint, boolean isActive);

//    // Custom query to find active routes by specific pickup point and timing
//    @Query("SELECT r FROM Route r WHERE r.isActive = true AND :pickupPoint MEMBER OF r.pickupPoints AND r.pickupTimings[:pickupPoint] = :timing")
//    List<Route> findActiveRoutesByPickupPointAndTiming(String pickupPoint, String timing);

    // Additional custom queries for bus assignments and timings
    List<Route> findByPickingUpBusTimingAndIsActive(String timing, boolean isActive);

    List<Route> findByNoonLeavingBusTimingAndIsActive(String timing, boolean isActive);

    List<Route> findByEveningLeavingBusTimingAndIsActive(String timing, boolean isActive);

    // Custom queries for the new fields in Route.java
    List<Route> findByEndPointAndIsActive(String endPoint, boolean isActive);

    List<Route> findByEndTimingAndIsActive(String endTiming, boolean isActive);

    // Add more custom queries for the new fields in Route.java
    // ...

}
