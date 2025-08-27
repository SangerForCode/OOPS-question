package student;

public class studentdetails {
    public static void main(String args[]){
        student s1= new student("ayush",21,1,3);
        s1.printInfo();
        student s3= new student(s1);
        s3.printInfo();
        

    }
}
