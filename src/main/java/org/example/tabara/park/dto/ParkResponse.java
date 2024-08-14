package org.example.tabara.park.dto;

import lombok.Builder;
import lombok.Getter;
import org.example.tabara.park.domain.Park;

@Getter
@Builder
public class ParkResponse {

    private String name;

    private double latitude;

    private double longitude;


}
