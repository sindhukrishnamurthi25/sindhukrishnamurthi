import java.util.Scanner;
class stringtoint {
        public static void main(String[] args) 
        {
               Scanner s=new Scanner(System.in);
               String str=s.next();
                int number = Integer.parseInt(str);
    System.out.println("Actual String:"+ str);
    System.out.println("Converted to Int:" + number);
        }
}
