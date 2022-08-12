package com.example.study.model.network.response;


import com.example.study.model.enumclass.CategoryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryApiResponse {

    private Long id;

    @Enumerated(EnumType.STRING)
    private CategoryType type;

    private String title;

}
