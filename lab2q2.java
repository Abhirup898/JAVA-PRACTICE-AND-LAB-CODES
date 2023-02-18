import java.util.Scanner;

public class lab2q2
{
    public static void main(String[] args)
    {
        int even = 0, odd = 0;
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];

        for (int i = 0; i < 10; i++)
        {
            System.out.print("input" + (i+1) + "th " + "number: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++)
        {
            if (a[i]%2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        System.out.print("no of even numbers = " + even + "\n" + "no of odd mumbers = " + odd);
        sc.close();
    }
}
