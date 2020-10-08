public class Exception{
 public static void divide(int number){
     try {
         number=number/0;
     }
     catch (ArithmeticException ex) {

         System.out.println("number cant be divided");
     }
     }

    public static void main(String[] args) {
        divide(3);
    }

}
