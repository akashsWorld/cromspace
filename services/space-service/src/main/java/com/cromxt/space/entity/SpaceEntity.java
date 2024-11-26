package com.cromxt.space.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "spaces")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class SpaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    @JoinColumn(name = "space_owner")
    private SpaceUser owner;
    private String spaceName;
    private String description;
}
