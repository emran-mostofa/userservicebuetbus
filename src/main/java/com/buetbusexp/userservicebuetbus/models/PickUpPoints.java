//package com.buetbusexp.userservicebuetbus.models;
//package com.buetbusexp.userservicebuetbus.models;
//
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "pickuppoints")
//@Getter
//@Setter
//public class PickUpPoints {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private  Long id;
//
//
//    @ManyToOne
//    @JoinColumn(name = "route_id")
//    private Route route;
//
//}
//
