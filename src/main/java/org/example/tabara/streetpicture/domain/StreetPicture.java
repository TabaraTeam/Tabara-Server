package org.example.tabara.streetpicture.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.tabara.common.BaseEntity;
import org.example.tabara.park.domain.Destination;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class StreetPicture extends BaseEntity {


    @Column(nullable = false)
    private String url;

    @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Destination destination;

    @OneToMany(mappedBy = "picture")
    @ToString.Exclude
    private List<FoundObject> object = new ArrayList<>();

}
