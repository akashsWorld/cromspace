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
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    @JoinColumn(name = "space_owner")
    private SpaceUser owner;
    @Column(nullable = false)
    @NotBlank
    private String spaceName;
    private String description;
    private String spaceImageUrl;
}
