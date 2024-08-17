package org.example.tabara.park.service;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.example.tabara.park.domain.Park;
import org.example.tabara.park.dto.ParkResponse;
import org.example.tabara.park.repository.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service
@Slf4j // log.info
public class ParkService {

    private final ParkRepository parkRepository;


    public ParkService(ParkRepository parkRepository){
        this.parkRepository = parkRepository;
    }


    public ParkResponse findAddr(String Parkname){
        Park ParkbyName = parkRepository.findByName(Parkname).get();


        ParkResponse parkResponse = ParkResponse.builder()
                .name(ParkbyName.getName())
                .latitude(ParkbyName.getLatitude())
                .longitude(ParkbyName.getLongitude())
                .build();



        return parkResponse;


    }


}
