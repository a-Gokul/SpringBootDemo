package beans;

 public class Employee {

     private String name;

     
     public Employee(Address adr){
         System.out.println("This is Employees Address");
         adr.display();
     }
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

    public void show(){
        System.out.println("Employee logged in ");
    }

}

