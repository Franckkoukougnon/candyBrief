package com.candy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Entité ItemCandyBox
@Entity
@Table(name = "itemcandybox")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemCandyBox {
    @EmbeddedId
    private ItemCandyBoxId id;

    @ManyToOne
    @JoinColumn(name = "id_candybox", insertable = false, updatable = false)
    private CandyBox candyBox;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Color color;

    @Column(name = "qte")
    private int quantity;

    // Constructeurs, getters et setters
}