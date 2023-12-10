package org.leombprojects.product.services;

import org.leombprojects.models.swagger.api.ProductsDto;

import java.util.List;

public interface ProductsService {
    ProductsDto getProdutsByCourse(String course);

}
