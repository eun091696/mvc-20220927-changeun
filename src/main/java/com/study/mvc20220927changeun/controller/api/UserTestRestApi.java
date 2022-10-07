package com.study.mvc20220927changeun.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RetController을 사용하면 @ResponseBody 사용 없이 텍스트로 사용 가능
@RestController
public class UserTestRestApi {

    @GetMapping("api/test/user/rest")
    public String getUserName() {
        return "안창은";
    }
}
