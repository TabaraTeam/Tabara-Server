package org.example.tabara.park.repository;

import org.example.tabara.park.domain.Park;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ParkRepository extends JpaRepository<Park, Double> {


    // select * from park where name = :parkName
    Optional<Park> findByName(String parkName);
    
}
