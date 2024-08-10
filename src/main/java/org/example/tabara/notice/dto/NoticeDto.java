package org.example.tabara.notice.dto;

import lombok.*;
import org.example.tabara.notice.domain.Notice;

@Getter
@Builder
@AllArgsConstructor
public class NoticeDto {
    private  String title;
    private  String content;


/*
* @NoArgsConstructor : 파라미터가 없는 디폴트 생성자를 생성
@AllArgsConstructor : 모든 필드 값을 파라미터로 받는 생성자를 생성
@RequiredArgsConstructor : final이나 @NonNull으로 선언된 필드만을 파라미터로 받는 생성자를 생성
 @DATA : 클래스 멤버 변수의 Getter/Setter 메서드를 구현해준다
* */

}
