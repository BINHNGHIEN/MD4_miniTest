package com.codegym.service.impl;


import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.repository.ICategoryRepository;
import com.codegym.repository.IProductRepository;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return iProductRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public Iterable<Product> findAllByName(String name) {
        return iProductRepository.findAllByNameContaining(name);
    }

    @Override
    public Iterable<Category> fillAddCate() {
        return iCategoryRepository.findAll();
    }

}
