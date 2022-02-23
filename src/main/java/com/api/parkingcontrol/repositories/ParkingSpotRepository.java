package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
// extends JpaRepository<"qual o model desse repository", "identificador">
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    //Anotações JPA para banco

    public boolean existsByLicensePlateCar(String licensePlateCar);

    public boolean existsByParkingSpotNumber(String parkingSpotNumber);

    public boolean existsByApartmentAndBlock(String apartment, String block);

    //public List<ParkingSpotModel> findAll();
}
