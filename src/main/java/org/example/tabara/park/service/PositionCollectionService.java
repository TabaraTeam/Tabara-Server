package org.example.tabara.park.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.tabara.park.domain.Park;
import org.example.tabara.park.domain.Position;
import org.example.tabara.park.dto.ParkInfo;
import org.example.tabara.park.repository.PositionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PositionCollectionService {

    private final PositionRepository positionRepository;

    private final ParkService parkService;



    @Transactional
    public void save(ParkInfo info) {
        log.info("data : {}", info.getName());


        Park park = parkService.findByName(info.getPark());


        Position position = new Position(info.getLatitude(),info.getLongitude(), info.getName(),"2024-01-01", park);


        positionRepository.save(position);

    }


    @Transactional(readOnly = true)
    public List<Position> findAll(){
        return positionRepository.findAll();
    }





}