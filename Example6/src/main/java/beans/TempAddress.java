package beans;

public class TempAddress implements Address{
    String address;

    public TempAddress(){
        this.address="Temp";
    }

    public TempAddress(String address){
        this.address=address;
    }
    public void display(){
        System.out.println("temporary Address:"+address);
    }



}
