package com.example.study.controller;


import com.example.study.model.SearchParam;
import com.example.study.model.network.Header;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest() {

        return "hello world";
    }

    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd) {
        String password = "bbbb";

        System.out.println("id : " + id);
        System.out.println("pwd: " + pwd);

        return id + " " + pwd + " " + password;
    }

    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        //자동 json 변환 후 리턴
        return searchParam;
    }

    @GetMapping("/header")
    public Header getHeader() {

        // {"resultCode" : "OK", "description" : "OK}
        return Header.builder().resultCode("OK").description("OK").build();
    }
}
