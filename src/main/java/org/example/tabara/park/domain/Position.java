package org.example.tabara.park.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.tabara.common.BaseEntity;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Position extends BaseEntity {


    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String createDate;

    @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Park park;


}
