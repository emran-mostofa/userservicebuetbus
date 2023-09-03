package com.buetbusexp.userservicebuetbus.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pickuppoints")
@Getter
@Setter
public class PickUpPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;
    private String name;
    private Double longitude;
    private Double latitude;
    private String time;

    public PickUpPoints(Route route, String name, Double longitude, Double latitude, String time) {
        this.route = route;
        this.name=name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.time = time;
    }

    public PickUpPoints() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

