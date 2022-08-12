package com.example.study.controller;


import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // Html <Form>
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form / text-plain

    //GET 조회(SELELCT * READ)  /user/{id}


    //POST 생성(CREATE) /user
    @PostMapping("/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {

        return searchParam;
    }
    //PUT / PATCH 수정(UPDATE) * CREATE /user
    @PutMapping("/putMethod")
    public void put() {

    }
    //DELETE 삭제(DELETE) /user/{1}
    @PatchMapping("/patchMethod")
    public void patch() {

    }


}
