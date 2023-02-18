import java.util.Scanner;

public class prog5
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first name: ");
        String firstname = sc.next();

        System.out.print("Input last name: ");
        String lastname = sc.next();

        System.out.println("Name: " + firstname + " " + lastname);
        sc.close();
    }
}
