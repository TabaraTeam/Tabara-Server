package org.example.tabara.park.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.tabara.park.domain.Position;
import org.example.tabara.park.dto.ParkInfo;
import org.example.tabara.park.service.PositionCollectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class PositionCollectionController {

    private final PositionCollectionService positionCollectionService;


    @GetMapping("/position/list")
    public String list(Model model) {
        List<Position> data = positionCollectionService.findAll();

        model.addAttribute("list", data);

        return "list";
    }



    @GetMapping("/position")
    public String addPage() {
        return "position";

    }



    @PostMapping("/position")
    public String add(@ModelAttribute ParkInfo parkInfo){
        positionCollectionService.save(parkInfo);
        return "redirect:/position";
    }


}
