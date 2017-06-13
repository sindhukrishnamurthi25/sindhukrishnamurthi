import java.util.Scanner;

public class swap
{
    public static void main(String[] input)
    {
        Scanner scan = new Scanner(System.in);
      String   s= scan.nextLine();
       String[] words = s.split("\\s"); 
       if (words.length > 1)
       { 
	      s =s.substring(s.indexOf(words[1], words[0].length() -2 )) + " " + words[0];
          s = s.substring(0, 1)+ s.substring(1); 
       }
       System.out.println(s);
    }
}
