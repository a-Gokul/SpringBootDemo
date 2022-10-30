package main;

import beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.*;

public class Example4 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee emp = context.getBean(Employee.class);
        emp.show();
        System.out.println(emp.getName());

    }
}