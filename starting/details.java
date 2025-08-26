package starting;
class Student{
//properties of a student will go here
String name;
int rollNo;

public void showDetails(){
System.out.println("The student details are as follows:");
System.out.println("Name : "+this.name);
System.out.println("Roll No : "+this.rollNo);

}

Student(String name, int rollNo){
this.name = name;
this.rollNo = rollNo;
}
Student(Student s1){
    this.name= s1.name;
    this.rollNo = s1.rollNo;
}
}

public class details{
static int something;// if its not static we cat access static runs first
public static void main(String[] args) {

    Student s1 = new Student("rudra", 71);
    int awd = something;
   /// s1.showDetails();

    Student s2 = new Student(s1);
    s2.showDetails();

}
}