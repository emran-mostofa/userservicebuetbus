//package com.buetbusexp.userservicebuetbus.models;
////
//import jakarta.persistence.*;
//import java.util.List;
//import java.util.Map;
////
//@Entity
//@Table(name = "routes"
////uniqueConstraints = {
////        @UniqueConstraint(columnNames = "name")
////}
//)
//
//public class Route {
////
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
////
//    private String name;
//    private String description;
//    private String origin;
////
////    @ElementCollection
////    private List<String> pickupPoints;
////
////    @ElementCollection
////    @MapKeyColumn(name = "pickup_point")
////    @Column(name = "pickup_timing")
////    @CollectionTable(name = "route_pickup_timings", joinColumns = @JoinColumn(name = "route_id"))
////    private Map<String, String> pickupTimings;
////
////    private String driverName;
////    private String vehicleNumber;
////    private String schedule;
//    private String endPoint; // End point for the route's last stoppage
////    private String endTiming; // Timing for the end point
//    private boolean isActive;
////
////    // Additional fields for bus assignments
////    private String pickingUpBusTiming;
////    private String noonLeavingBusTiming;
////    private String eveningLeavingBusTiming;
////
////    // Getter and setter methods
////
////    // ... existing getters and setters ...
////
////    public String getEndPoint() {
////        return endPoint;
////    }
////
////    public void setEndPoint(String endPoint) {
////        this.endPoint = endPoint;
////    }
////
////    public String getEndTiming() {
////        return endTiming;
////    }
////
////    public void setEndTiming(String endTiming) {
////        this.endTiming = endTiming;
////    }
////
////    public String getPickingUpBusTiming() {
////        return pickingUpBusTiming;
////    }
////
////    public void setPickingUpBusTiming(String pickingUpBusTiming) {
////        this.pickingUpBusTiming = pickingUpBusTiming;
////    }
////
////    public String getNoonLeavingBusTiming() {
////        return noonLeavingBusTiming;
////    }
////
////    public void setNoonLeavingBusTiming(String noonLeavingBusTiming) {
////        this.noonLeavingBusTiming = noonLeavingBusTiming;
////    }
////
////    public String getEveningLeavingBusTiming() {
////        return eveningLeavingBusTiming;
////    }
////
////    public void setEveningLeavingBusTiming(String eveningLeavingBusTiming) {
////        this.eveningLeavingBusTiming = eveningLeavingBusTiming;
////    }
////}
