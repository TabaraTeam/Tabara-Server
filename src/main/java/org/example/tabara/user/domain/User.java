package org.example.tabara.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import org.example.tabara.common.BaseEntity;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends BaseEntity {


    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;




}
