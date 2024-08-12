package org.example.tabara.notice.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.tabara.common.BaseEntity;
import org.example.tabara.notice.dto.NoticeDto;
import org.example.tabara.user.domain.User;

@Builder
@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Notice extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;


    public static Notice toEntity(String title, String content) {
        return Notice.builder()
                .title(title)
                .content(content)
                .build();
    }


}
