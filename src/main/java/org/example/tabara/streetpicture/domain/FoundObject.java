package org.example.tabara.streetpicture.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.example.tabara.common.BaseEntity;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoundObject extends BaseEntity {

    @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private StreetPicture picture;

    @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;

}
