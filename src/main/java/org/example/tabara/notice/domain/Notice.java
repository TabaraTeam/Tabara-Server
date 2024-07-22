package org.example.tabara.notice.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.tabara.common.BaseEntity;
import org.example.tabara.user.domain.User;

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


    @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;



}
