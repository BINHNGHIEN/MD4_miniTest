package com.codegym.service;


import com.codegym.model.Category;
import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    void delete(Long id);

    Iterable<Product> findAllByName(String name);

    Iterable<Category> fillAddCate();

}
