package demo;


import org.springframework.stereotype.Component;

import java.lang.*;
@Component
public class ShoppingCart {

    public void checkout(){
        System.out.println("This is checkout method from ShoppingCart");
    }
}
