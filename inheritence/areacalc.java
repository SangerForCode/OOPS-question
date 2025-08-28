package inheritence;

class shape{
int l,h;
public void area(){System.out.println(" Bruh ");}
}
class triangle extends shape{
    public void area(int l, int h){
        System.out.println("The area is : " + 0.5*l*h);
    }
}
class eqTriangle extends triangle{
    public void area (int l){
        System.out.println("The area is : " + (Math.sqrt(3)/4)*l*l);
    }
}

public class areacalc{
public static void main(String Args[]){

}
}

