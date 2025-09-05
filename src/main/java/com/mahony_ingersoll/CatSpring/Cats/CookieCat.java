package com.mahony_ingersoll.CatSpring.Cats;

import org.springframework.stereotype.Component;

@Component
public class CookieCat implements Cat {

    public CookieCat() {
    }
    
    @Override
    public String sayMeow() {
        return "Chirp";
    }
}
