package com.mahony_ingersoll.CatSpring.Cats;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MistyCat implements Cat {
    
    public MistyCat() {
        System.out.println ("MistyCat constructor");
    }

    @Override
    public String sayMeow() {
        System.out.println ("MistyCat meowing");
        return "Meow";
    }
}
