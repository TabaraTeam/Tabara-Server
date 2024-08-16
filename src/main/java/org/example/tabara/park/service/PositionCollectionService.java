package org.example.tabara.park.service;

import lombok.RequiredArgsConstructor;
import org.example.tabara.park.repository.PositionRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PositionCollectionService {

    private final PositionRepository positionRepository;


}
