package com.candy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;



@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemCandyBoxId implements Serializable {
    @Column(name = "id")
    private int itemId;

    @Column(name = "id_candybox")
    private int candyBoxId;
}
