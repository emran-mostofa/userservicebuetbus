package com.buetbusexp.userservicebuetbus.repository;

import com.buetbusexp.userservicebuetbus.models.PickUpPoints;
import com.buetbusexp.userservicebuetbus.models.TrackGPS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface PickUpPointsRepository extends JpaRepository<PickUpPoints, Long>{

    List<PickUpPoints> findbyRouteId(Long routeId);
List<PickUpPoints> findbyRouteIdAndStopName(Long routeId, String stopName);
List<PickUpPoints> findbyRouteIdAndStopNameAndStopTime(Long routeId, String stopName, Date stopTime);
List<PickUpPoints> findbyRouteIdAndStopNameAndStopTimeAndStopLocation(Long routeId, String stopName, Date stopTime, String stopLocation);
List<PickUpPoints> findbyRouteIdAndStopNameAndStopTimeAndStopLocationAndStopLatitude(Long routeId, String stopName, Date stopTime, String stopLocation, Double stopLatitude);


}
