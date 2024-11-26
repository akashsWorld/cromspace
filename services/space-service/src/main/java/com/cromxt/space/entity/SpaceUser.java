package com.cromxt.space.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "space_user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SpaceUser {
    @Id
    private String id;
    @NotBlank
    @Column(name = "space_name", nullable = false)
    private String spaceName;
    private String bio;
    @OneToMany(mappedBy = "owner")
    private Set<Space> spaceEntities;
    private String profileImage;
}
