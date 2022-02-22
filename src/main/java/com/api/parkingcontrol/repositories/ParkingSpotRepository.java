package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
// extends JpaRepository<"qual o model desse repository", "identificador">
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
