import java.util.*;
public class sumofnatural
 {
     public static void main(String[] args)
     {
        int n,i=1,sum=0;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        do
            {
                 sum=sum+i;
                 i +=1;
            }   while(i<=n);
                 System.out.print(sum);
     }
     
}
