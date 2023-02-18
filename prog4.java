import java.util.Scanner;

public class prog4
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int reverse = 0;
        int original = n;

        while (n!=0)
        {
            reverse = reverse*10 + n%10;

            n = n/10;
        }

        if (reverse == original)
        {
            System.out.println("The number is a palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }
        sc.close();
    }
}