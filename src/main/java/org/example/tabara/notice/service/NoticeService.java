package org.example.tabara.notice.service;

import lombok.RequiredArgsConstructor;
import org.example.tabara.notice.domain.Notice;
import org.example.tabara.notice.dto.NoticeDto;
import org.example.tabara.notice.repository.NoticeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeRepository noticeRepository;


    public List<NoticeDto> finAll() {
        List<Notice> notice = noticeRepository.findAll();


        List<NoticeDto> result = new ArrayList<>();

        for(int i=0; i<notice.size(); i++) {

            result.add(NoticeDto.builder()
                    .title(notice.get(i).getTitle())
                    .content(notice.get(i).getContent())
                    .build()
            );
        }

//        new NoticeDto(title, content)

        return result;
    }


}
