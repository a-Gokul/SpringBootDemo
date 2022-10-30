package modules;

import modules.Address;

public class Employee{

    public Address address;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Address address){
        this.address=address;
    }
    public void setAddress(Address address){
        this.address=address;
    }

}  