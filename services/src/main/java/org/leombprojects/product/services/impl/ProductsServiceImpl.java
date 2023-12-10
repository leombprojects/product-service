package org.leombprojects.product.services.impl;

import lombok.RequiredArgsConstructor;
import org.leombprojects.models.swagger.api.ProductDto;
import org.leombprojects.models.swagger.api.ProductsDto;
import org.leombprojects.product.models.ProductsModel;
import org.leombprojects.product.services.mappers.Mapper;
import org.springframework.stereotype.Service;
import org.leombprojects.product.repositories.ProductsRepository;
import java.util.List;
import org.leombprojects.product.services.ProductsService;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {

    private final ProductsRepository productsRepository;
    private final Mapper mapper;
    @Override
    public ProductsDto getProdutsByCourse(String course) {

        List<ProductsModel> listProductsModel = productsRepository.findByCourse(course);

        ProductsDto productsDto = new ProductsDto();
        List<ProductDto> productDtos = mapper.convertToDto(listProductsModel, ProductDto.class);
        productsDto.setProductList(productDtos);

        return productsDto;
    }
}
