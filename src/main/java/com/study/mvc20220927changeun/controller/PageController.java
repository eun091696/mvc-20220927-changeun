package com.study.mvc20220927changeun.controller;

import com.study.mvc20220927changeun.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/test1")
    public String test1() {
        return "test_page1";
    }

    @GetMapping("/test2")
    public String test2() {
        System.out.println("test2");
        return "test/test_page2";
    }

    //ResponseBody 사용시 View Resolver 적용이 안된다. (응답을 값으로 하겠다)
    //따라서 text파일로 화면에 나타남
//    @ResponseBody
//    @GetMapping("/test3")
//    public String test3() {
//        return "test_page1";
//    }

    //@RequsetParam은 get요청때만 사용, 주소창에서는 ?뒤에 온다.
    @GetMapping("/test3")
//    public String test3(Model model, @RequestParam("strData") String str) {
//    위 내용을 간략하게 나타낸 코드가 아래 코드이다.
    public String test3(Model model, @RequestParam String strData, @RequestParam String name) {
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute("data", strData);
        model.addAttribute("name", name);

        return "test/test_page3";
    }
    @GetMapping("/test4")
    public String test4(Model model, TestReqDto testReqDto) {
        System.out.println(testReqDto);

        model.addAttribute("data", testReqDto.getStrData());
        model.addAttribute("name", testReqDto.getName());
        model.addAttribute("number", testReqDto.getNumber());

        return "test/test_page4";
    }

}
