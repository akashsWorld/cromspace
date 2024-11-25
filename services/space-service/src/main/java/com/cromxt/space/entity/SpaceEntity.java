package com.cromxt.space.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "spaces")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpaceEntity {
    @Id
    private String id;
    @Column(nullable = false)
    @NotBlank
    private String ownerName;
}
