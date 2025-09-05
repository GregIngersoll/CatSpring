package com.mahony_ingersoll.CatSpring.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahony_ingersoll.CatSpring.Cats.Cat;

@RestController
public class CatController {
    
    private Cat myCat;

    @Autowired
    public CatController(Cat theCat) {
        myCat = theCat;
        System.out.println ("CatController");
    }

    @GetMapping("/sayMeow")
    public String sayMeow() {
        System.out.println("/sayMeow Endpoint");
        return myCat.sayMeow();
    }
}
