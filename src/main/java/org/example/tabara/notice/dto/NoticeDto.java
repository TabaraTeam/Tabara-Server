package org.example.tabara.notice.dto;

import lombok.*;
import org.example.tabara.notice.domain.Notice;

@Getter
@Builder
@AllArgsConstructor
public class NoticeDto {
    private  String title;
    private  String content;




}
