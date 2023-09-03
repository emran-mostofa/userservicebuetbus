package com.buetbusexp.userservicebuetbus.payload.request;

import com.buetbusexp.userservicebuetbus.models.PickUpPoints;
import com.buetbusexp.userservicebuetbus.models.Route;

import java.util.List;

public class RouteAddRequest {
    private String name;
    private String description;
    private List<PickUpPoints> pickupPoints;
    private PickUpPoints startPickUpPoint;
    private PickUpPoints endPickUpPoint;
    private String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PickUpPoints> getPickupPoints() {
        return pickupPoints;
    }

    public void setPickupPoints(List<PickUpPoints> pickupPoints) {
        this.pickupPoints = pickupPoints;
    }

    public PickUpPoints getStartPickUpPoint() {
        return startPickUpPoint;
    }

    public void setStartPickUpPoint(PickUpPoints startPickUpPoint) {
        this.startPickUpPoint = startPickUpPoint;
    }

    public PickUpPoints getEndPickUpPoint() {
        return endPickUpPoint;
    }

    public void setEndPickUpPoint(PickUpPoints endPickUpPoint) {
        this.endPickUpPoint = endPickUpPoint;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
