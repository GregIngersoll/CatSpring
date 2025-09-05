package com.mahony_ingersoll.CatSpring.Cats;

import org.springframework.stereotype.Component;

@Component
public class PixieCat implements Cat {

    public PixieCat() {
    }

    @Override
    public String sayMeow () {
        return "Mew";
    }
    
}
