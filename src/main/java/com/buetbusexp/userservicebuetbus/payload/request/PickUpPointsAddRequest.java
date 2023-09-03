package com.buetbusexp.userservicebuetbus.payload.request;

import com.buetbusexp.userservicebuetbus.models.Route;
import jakarta.validation.constraints.NotBlank;

public class PickUpPointsAddRequest {

private Route route;
private String name;
private Double longitude;
private Double latitude;
private String time;




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

    public PickUpPointsAddRequest() {

    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
