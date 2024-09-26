package com.sportxpert.sports.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "tbl_products")
public class Product {

    private String name;

    private Double price;

    private String description;

    private String category;

    private Integer quantity;
}
