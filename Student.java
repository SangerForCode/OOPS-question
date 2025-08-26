public class Student {
    private int s_marks, e_marks;
    static int total_marks;

    Student(int a, int b){
        s_marks = a; e_marks = b;
    }



    class quark{
        int date;
        quark(int date){
            this.date = date;
        }
    }

    int calculate_marks(){ 

        total_marks = s_marks;
        
        return s_marks + e_marks;
        
    }

    int getSMarks(){ return s_marks; }
    void setSMarks(int a){ s_marks = a; }

    static int sizeofclass(){
        return 5;
    }

    static String name(){ return "Student"; }
}

class Animal{
    int life;
    boolean isBlack;
    int numLimbs;

    class niggers{
        int pl;
        niggers(){
            pl = 10;
        }
        int awd(){
            return life;
        }
    }
}

class Dog extends Animal{
    int something(){
        return this.life;
    }
}
