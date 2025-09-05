package com.mahony_ingersoll.CatSpring.Cats;

import org.springframework.stereotype.Component;

@Component
public class CookieCat implements Cat {

    public CookieCat() {
        System.out.println ("CookieCat Constructor");
    }
    
    @Override
    public String sayMeow() {
        System.out.println ("CookieCat Meow");
        return "Chirp";
    }
}
