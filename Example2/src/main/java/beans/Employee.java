package beans;

 public class Employee {
     public Address address;
     private String name;

    public Employee() {

        System.out.println("def cons");
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Employee(Address address){
         this.address=address;
     }

     public void setAddress(Address address) {
         this.address = address;
     }

    public void show(){
        System.out.println("Employee logged in ");
    }

}

