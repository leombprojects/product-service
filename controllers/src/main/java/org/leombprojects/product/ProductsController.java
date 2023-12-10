package org.leombprojects.product;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.leombprojects.models.swagger.api.ProductsDto;
import org.leombprojects.models.swagger.model.ProductApiDelegate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.leombprojects.product.services.ProductsService;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ProductsController implements ProductApiDelegate {

    private final ProductsService productsService;

    @Override
    public ResponseEntity<ProductsDto> listProductsByCourse(String course) {

        return ResponseEntity.ok(productsService.getProdutsByCourse(course));
    }
}
