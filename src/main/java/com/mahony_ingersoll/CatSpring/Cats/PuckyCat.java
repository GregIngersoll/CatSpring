package com.mahony_ingersoll.CatSpring.Cats;

import org.springframework.stereotype.Component;

@Component
public class PuckyCat implements Cat {
    
    @Override
    public String sayMeow() {
        return "Meeeoooowwww";
    }
}
