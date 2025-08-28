package labs;
class Employee{
    private String name;
   private int id;
   private String department;
public Employee(String name,int id, String department){
    this.name=name;
    this.id=id;
    this.department=department;
}
public Employee(String name,int id){
    this.name=name;
    this.id=id;
}
public Employee(String name){
    this.name=name;

}


public void displayDetails() {
       System.out.println("Name: " + name);
       if (id != 0) {
           System.out.println("ID: " + id);
       }
       if (department != null) {
           System.out.println("Department: " + department);
       }
    }
}
public class Employeetest {
       public static void main(String[] args) {
       Employee emp1 = new Employee("Geek1");
       emp1.displayDetails();

       Employee emp2 = new Employee("Geek2", 101);
       emp2.displayDetails();

       Employee emp3 = new Employee("Geek3", 102, "Engineering");
       emp3.displayDetails();
   }
}
