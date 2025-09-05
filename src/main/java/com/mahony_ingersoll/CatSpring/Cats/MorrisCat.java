package com.mahony_ingersoll.CatSpring.Cats;

import org.springframework.stereotype.Component;

@Component
public class MorrisCat implements Cat{

    public MorrisCat() {
    }

    @Override
    public String sayMeow() {
        return "Meow (snore)";
    }
    
}
