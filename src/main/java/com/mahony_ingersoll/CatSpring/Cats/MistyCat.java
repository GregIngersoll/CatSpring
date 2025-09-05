package com.mahony_ingersoll.CatSpring.Cats;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MistyCat implements Cat {
    
    public MistyCat() {
    }

    @Override
    public String sayMeow() {
        return "Meow";
    }
}
