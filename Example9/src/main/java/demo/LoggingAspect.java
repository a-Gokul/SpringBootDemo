package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    //Called before execution
    @Before("execution(* demo.ShoppingCart.checkout())")
    public void beforeLogger(){

        System.out.println("Before Loggers");
    }

    //called after execution
    @After("execution(* *.*.checkout())")
    public void afterLogger(){

        System.out.println("After Loggers");
    }
}
