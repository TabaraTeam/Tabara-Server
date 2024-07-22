package org.example.tabara.park.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.tabara.common.BaseEntity;
import org.example.tabara.user.domain.User;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Destination extends BaseEntity {

    @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Position position;

    @Column(nullable = false)
    private String startTime;

    @Column(nullable = false)
    private String finishTime;



}
