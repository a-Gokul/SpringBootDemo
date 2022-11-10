package main;

import beans.Employee;
import beans.PermAddress;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.*;

public class Example5 {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PermAddress permaddr = new PermAddress("1st Street");
        Employee emp = new Employee(permaddr);




    }
}