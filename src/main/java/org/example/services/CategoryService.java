package org.example.services;

import org.example.dtos.request.CategoryRequest;
import org.example.dtos.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse createCategory(CategoryRequest request);
    CategoryResponse updateCategory(CategoryRequest request);
    CategoryResponse deleteCategory(CategoryRequest request);
    List<CategoryResponse> getAllCategories();
    List<CategoryResponse> getAllCategoriesByUserId(String id);
}
