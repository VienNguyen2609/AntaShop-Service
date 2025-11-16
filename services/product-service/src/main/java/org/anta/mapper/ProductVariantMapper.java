package org.anta.mapper;


import org.anta.dto.request.ProductVariantRequest;
import org.anta.dto.response.ProductVariantResponse;
import org.anta.entity.Product;
import org.anta.entity.ProductVariant;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductVariantMapper.class})
public interface ProductVariantMapper {

    @Mapping(target = "productId", source = "product.id")
    @Mapping(target = "productName", source = "product.name")
    ProductVariantResponse toResponse(ProductVariant entity);

    List<ProductVariantResponse> toResponseList(List<ProductVariant> entities);

    @Mapping(target = "product", ignore = true)
    @Mapping(target = "id", ignore = true)
    ProductVariant toEntity(ProductVariantRequest req);

    @Mapping(target = "product", ignore = true)
    void updateFromRequest(ProductVariantRequest req, @MappingTarget ProductVariant entity);

    @AfterMapping
    default void setParentForVariants(@MappingTarget Product product) {
        if (product == null || product.getVariants() == null) return;
        for (ProductVariant v : product.getVariants()) {
            v.setProduct(product); // set parent
        }
    }
}
