package main;

import modules.Address;
import modules.Employee;

import java.lang.*;

public class Example1 {

    public static void main(String[] args) {
        Address addr = new Address();
        addr.setAddress("IND");
        Employee emp = new Employee(addr);
        emp.setName("John");
        System.out.println(emp.getName());
        System.out.println(emp.address.getAddress());

    }
}
