import java.util.Scanner;
class Numfactorial {
 
        public static void main(String[] args) 
        {
               Scanner s=new Scanner(System.in);
                int number =s.nextInt();
                int factorial = number;
                if(number==0)
                System.out.println("Factorial of a number is  1" );
               else if(number>=1)
                {
               for(int i =1; i > 1; i--)
                {
                        factorial = factorial * i;
                }
       
                System.out.println("Factorial of a number is " + factorial);
        }
              else
             System.out.println("negative number");
        }
}
 


