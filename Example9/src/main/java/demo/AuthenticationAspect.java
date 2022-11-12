package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticatingPointCut(){
        System.out.println("Authenticating........");
    }

    @Pointcut("within(demo..*)")
    public void authorizingPointCut(){
        System.out.println("Authorizing........");
    }

    @Before("authenticatingPointCut() && authorizingPointCut()")
    public void authenticate(){
        System.out.println("AUthenticating the request");
    }


}
