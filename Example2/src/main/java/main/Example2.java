package main;

import beans.Address;
import beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.*;

public class Example2 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("brk");
        Employee emp = context.getBean(Employee.class);
        emp.show();
        Address addr = context2.getBean(Address.class);
        addr.display();
    }
}