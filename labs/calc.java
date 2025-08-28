package labs;
//  Create a class Calculator with the following methods:
// calculateSum(int number1, int number2) to calculate the sum of two numbers.
// calculateDifference(int number1, int number2) to calculate the difference between two numbers.
class Calculator{
    int number1,number2;
    public int calculateSum(int num1,int num2){
        return num1+num2;
    }
     public int calculateDifference(int number1, int number2){
        return number1-number2;
     }
}
 public class calc{
     public static void main(String[] args) {
       Calculator c = new Calculator();

       int sum = c.calculateSum(10, 5);
       System.out.println("Sum: " + sum);

       int difference = c.calculateDifference(10, 5);
       System.out.println("Difference: " + difference);
   }
 }