package com.eontecnologia.springboot.repositories;

import com.eontecnologia.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
