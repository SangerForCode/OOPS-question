package student;

public class student {
    int age,roll,classYear;
    String name;
    student(String name, int age, int roll, int classYear ){
        this.name= name;
        this.age= age;
        this.roll= roll;
        this.classYear= classYear;
    }
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
        System.out.println("Class Year: " + classYear);
    }
    student(student s1){
        this.name= s1.name;
        this.age= s1.age;
        this.roll=s1.roll;
        this.classYear= s1.classYear;
    }
}


