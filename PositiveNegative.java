import java.util.Scanner;
public class PositiveNegative
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        if(num>=0)
		System.out.print("Positive number");
		else
        System.out.print("Negative number ");
    }
}
