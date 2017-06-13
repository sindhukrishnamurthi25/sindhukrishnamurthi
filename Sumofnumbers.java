import java.util.Scanner;
public class Sumofnumbers
{
    public static void main(String args[])
    {
        int i, n, sum=0;
        Scanner scan = new Scanner(System.in);
		 n = scan.nextInt();
	    for(i=1; i<=n; i++)
	    {
            sum = sum +i;
        }
		 System.out.print(sum);
    }
}
