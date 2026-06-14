package com.fighting.ecommerce.dao;

import com.fighting.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

    // import javax.persistence.EntityManager;
    //import javax.persistence.metamodel.EntityType;
    //
    //
    //With:
    //
    //import jakarta.persistence.EntityManager;
    //import jakarta.persistence.metamodel.EntityType;
}
