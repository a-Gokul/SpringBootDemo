package beans;

import org.springframework.stereotype.Component;

@Component
public class PermAddress implements Address {

    String address;
    public PermAddress(){
        this.address="Perm";
    }
    public PermAddress(String address){
        this.address=address;
    }
    public void display(){
        System.out.println(address);
    }



}
