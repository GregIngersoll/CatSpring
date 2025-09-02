package com.mahony_ingersoll.CatSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatSpringRestController {

    @GetMapping ("/")
    public String returnBasicCat()
    {
        return "This could be just any cat";
    }

    @GetMapping ("/AnotherCat")
    public String returnAnotherCat()
    {
        return "Another Cat";
    }

}