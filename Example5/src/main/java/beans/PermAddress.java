package beans;

public class PermAddress implements Address {

    String address;

    public PermAddress(String address){
        this.address=address;
    }
    public void display(){
        System.out.println(address);
    }



}
