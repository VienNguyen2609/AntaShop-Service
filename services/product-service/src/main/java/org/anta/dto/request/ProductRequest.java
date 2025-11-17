package org.anta.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class ProductRequest {


    private String name;

    private String brand;

    private String description;

    private Double price;

    private String category;

    private List<String> categories;

    private Integer totalStock;

    private List<String> images;

    private List<ProductVariantRequest> variants;

    private String createdAt;

}
