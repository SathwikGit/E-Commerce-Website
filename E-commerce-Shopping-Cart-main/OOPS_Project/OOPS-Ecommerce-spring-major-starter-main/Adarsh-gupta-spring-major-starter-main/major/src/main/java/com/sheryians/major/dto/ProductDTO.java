package com.sheryians.major.dto;

import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProductDTO {
    private Long id;
    private String name;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="category_id",referencedColumnName = "category_id")
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
