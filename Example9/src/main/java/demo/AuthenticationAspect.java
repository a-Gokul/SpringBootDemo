package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo.ShoppingCart.*)")
    public void authenticatingPointCut(){
        System.out.println("Authenticating........");
    }

    @Pointcut("within(demo.ShoppingCart.*)")
    public void authorizingPointCut(){
        System.out.println("Authorizing........");
    }

    @Before("authenticatingPointCut")
    public void authenticate(){
        System.out.println("AUthenticating the request");
    }


}
