package com.buetbusexp.userservicebuetbus.repository;

import com.buetbusexp.userservicebuetbus.models.TrackGPS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface TrackGPSRepository extends JpaRepository<TrackGPS, Long> {
    // Find all tracks for a specific bus ID
    List<TrackGPS> findByBusId(Long busId);

//    // Find all tracks within a specific time range
//    List<TrackGPS> findByTimestampBetweenOrderByTimestampAsc(long startTime, long endTime);

//   //  Find the latest track for a specific bus ID
//    @Query("SELECT t FROM TrackGPS t WHERE t.busId = ?1 ORDER BY t.timestamp DESC")
//    TrackGPS findLatestTrackForBus(Long busId);

//    // Find tracks with a specific speed greater than the given value
//    List<TrackGPS> findBySpeedGreaterThan(double speed);
//
//    // Find tracks with a specific latitude and longitude
//    List<TrackGPS> findByLatitudeAndLongitude(double latitude, double longitude);

}
