package com.mahony_ingersoll.CatSpring.RestControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class CatSpringRestController {

    @Value ("${foo1.name}")
    private String foo1Name;
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