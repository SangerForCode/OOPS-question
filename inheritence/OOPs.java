package inheritence;
class creature{
    String name;
    int lifeSpan; //in years
    boolean isBlack;
    public void print() {
    System.out.println("Name: " + name);
    System.out.println("Life Span: " + lifeSpan + " years");
    System.out.println("Is Black: " + isBlack);
}

}
class Human extends creature {
}
public class OOPs {
    public static void main(String args[]) {
        Human bob = new Human();
        bob.name="bob";
        bob.lifeSpan=30;
        bob.print();
    }
}