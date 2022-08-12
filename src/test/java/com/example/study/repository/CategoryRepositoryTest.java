package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Category;
import com.example.study.model.enumclass.CategoryType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class CategoryRepositoryTest extends StudyApplicationTests {

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    public void create() {
        String title = "컴퓨터";
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "AdminServer";

        Category category = new Category();

        category.setType(CategoryType.COMPUTER);
        category.setTitle(title);
        category.setCreatedAt(createdAt);
        category.setCreatedBy(createdBy);

        Category newCategory = categoryRepository.save(category);
        Assertions.assertNotNull(newCategory);
        Assertions.assertEquals(newCategory.getType(), CategoryType.COMPUTER);
        Assertions.assertEquals(newCategory.getTitle(), title);
    }

    @Test
    public void read() {
        String type = "COMPUTER";

//        Category category = categoryRepository.findByType(type);
//        category.ifPresent(c -> {
//
//            Assertions.assertEquals(c.getType(),  "COMPUTER");
//            System.out.println(c.getId());
//            System.out.println(c.getType());
//            System.out.println(c.getTitle());
//        });
    }
}
