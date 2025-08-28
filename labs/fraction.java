class Fraction{

   private int num, denom;

   public Fraction (){

       num = 0;

       denom = 1;   }

    public Fraction (int n){

       num = n;

       denom = 1;   }

    public Fraction (int p, int q)   {

       num = p;

       denom = q;
       reduce();

    }

   public Fraction (Fraction other)   {

       num = other.num;

       denom = other.denom;   }

   public Fraction reduce(){
    
   }

public Fraction invert(Fraction a){  }

  public Fraction add(Fraction a, Fraction b){ }

public Fraction add (Fraction a, int n)   { ... }

}