package com.codegym.service;


import com.codegym.model.Category;

public interface ICategoryService {

    Iterable<Category> findAll();

    Category findById(Long id);

    void deleteById(Long id);

    Category save(Category category);
}
