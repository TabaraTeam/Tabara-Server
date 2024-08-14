package org.example.tabara.park.controller;

import lombok.RequiredArgsConstructor;
import org.example.tabara.park.domain.Park;
import org.example.tabara.park.dto.ParkResponse;
import org.example.tabara.park.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ParkController {

    private final ParkService parkService;



    // String -> dto
    @GetMapping("/park/address")
    public ParkResponse getName(@RequestParam("name")String Parkname) {
        parkService.findAddr(Parkname);
        ParkResponse response = parkService.findAddr(Parkname);
                return response;

    }



}