package main;

import beans.BeanConfig;
import beans.Employee;
import beans.PermAddress;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.*;

public class Example7 {

    public static void main(String[] args) {


        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

       ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        PermAddress permaddr = context.getBean(PermAddress.class);
        Employee emp = new Employee(permaddr);




    }
}