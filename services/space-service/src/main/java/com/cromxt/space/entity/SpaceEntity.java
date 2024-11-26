package com.cromxt.space.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

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
    @Column(nullable = false)
    @NotBlank
    private String ownerName;
}
