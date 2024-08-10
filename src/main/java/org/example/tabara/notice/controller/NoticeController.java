package org.example.tabara.notice.controller;

import lombok.RequiredArgsConstructor;
import org.example.tabara.notice.domain.Notice;
import org.example.tabara.notice.dto.NoticeDto;
import org.example.tabara.notice.repository.NoticeRepository;
import org.example.tabara.notice.service.NoticeDtoService;
import org.example.tabara.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;



    @GetMapping("/notice")
    public List<NoticeDto> getUserDto() {
        List<NoticeDto> noti = noticeService.finAll();
        return noti;
    }







}
