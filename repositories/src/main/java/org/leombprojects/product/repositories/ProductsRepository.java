package org.leombprojects.product.repositories;

import org.leombprojects.product.models.ProductsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsModel, Long> {
    List<ProductsModel> findByCourse(String course);
    ProductsModel findByCode(String code);
}
