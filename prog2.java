import java.util.Scanner;

public class prog2
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Input your marks: ");
    int marks = sc.nextInt();
    
    if (marks >= 90) 
    {
      System.out.println("Grade: O(OUTSTANDING)");
    } 
    else if (marks >= 80) 
    {
      System.out.println("Grade: E(EXCELLENT)");
    } 
    else if (marks >= 70) 
    {
      System.out.println("Grade: A(VERY GOOD)");
    } 
    else if (marks >= 60) 
    {
      System.out.println("Grade: B(GOOD)");
    } 
    else if (marks >= 50)
    {
      System.out.println("Grade: C(JUST PASS)");
    }
    else if (marks >= 40)
    {
        System.out.println("Grade: D(SATISFACTORY)");
    }
    else
    {
        System.out.println("Grade: F(WORK HARD)");
    }
    sc.close();
  }
}