package com.buetbusexp.userservicebuetbus.models;
//
import jakarta.persistence.*;
import java.util.List;
import java.util.Map;
//
@Entity
@Table(name = "routes",uniqueConstraints = {
        @UniqueConstraint(columnNames = "name")
})

public class Route {
    //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //
    private String name;
    private String description;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PickUpPoints> pickupPoints;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "start_pickup_point_id")
    private PickUpPoints startPickUpPoint;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "end_pickup_point_id")
    private PickUpPoints endPickUpPoint;

    //add time attribute
    private String time;

    public Route(Long id, String name, String description, List<PickUpPoints> pickupPoints, PickUpPoints startPickUpPoint, PickUpPoints endPickUpPoint, String time) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.pickupPoints = pickupPoints;
        this.startPickUpPoint = startPickUpPoint;
        this.endPickUpPoint = endPickUpPoint;
        this.time = time;
    }

    public Route() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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