package com.mikecifuentes.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mikecifuentes.products.models.ProductModel;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{

}