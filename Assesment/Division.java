

public class Division{
public static void main(String[] args) {
      for(int i=0;i<4;i++){
          int divisor = i;
          try{
              int numerator =10;
              int result = divide(numerator,divisor);
              System.out.println("Result of " + numerator + " / " + divisor + " = " + result );
          }catch(ArithmeticException e){
              System.out.println("Exception " + e.getMessage());
              System.out.println("Result: -1");
          }
      }
    }

    private static int divide(int numerator , int divisor) {
        return numerator / divisor;
    }
}
