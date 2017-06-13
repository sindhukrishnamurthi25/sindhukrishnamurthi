import java.util.Scanner;
class Digit
{
    public static void main(String args[])
    {
        int num, rev=0, rem,count=0;
        Scanner scan = new Scanner(System.in);
	   num = scan.nextInt();
		while(num != 0)
        {
            rem = num%10;
            rev = rev+ rem;
            num = num/10;
			count++;
        }
		 System.out.print(count);
    }
}
