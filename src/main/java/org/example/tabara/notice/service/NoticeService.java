package org.example.tabara.notice.service;

import lombok.RequiredArgsConstructor;
import org.example.tabara.notice.domain.Notice;
import org.example.tabara.notice.dto.NoticeDto;
import org.example.tabara.notice.repository.NoticeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeRepository noticeRepository;

    public List<Notice> finAll() {
        List<Notice> notice = noticeRepository.findAll();
        return notice;
    }



}
