package com.mahony_ingersoll.CatSpring.Cats;

import org.springframework.stereotype.Component;

@Component
public class PixieCat implements Cat {

    public PixieCat() {
        System.out.println ("PixieCat constructor");
    }

    @Override
    public String sayMeow () {
        System.out.println ("PixieCat saying meow");
        return "Mew";
    }
    
}
