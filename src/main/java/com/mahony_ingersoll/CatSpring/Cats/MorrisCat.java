package com.mahony_ingersoll.CatSpring.Cats;

import org.springframework.stereotype.Component;

@Component
public class MorrisCat implements Cat{

    public MorrisCat() {
        System.out.println ("Morris Cat");
    }

    @Override
    public String sayMeow() {
        System.out.println ("Morris Meow");        
        return "Meow (snore)";
    }
    
}
