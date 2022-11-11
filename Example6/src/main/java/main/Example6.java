package main;

import beans.Employee;
import beans.PermAddress;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.*;

public class Example6 {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PermAddress permaddr = context.getBean(PermAddress.class);
        Employee emp = new Employee(permaddr);




    }
}