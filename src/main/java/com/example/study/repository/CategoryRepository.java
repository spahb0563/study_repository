package com.example.study.repository;

import com.example.study.model.entity.Category;
import com.example.study.model.enumclass.CategoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByType(CategoryType type);

}
