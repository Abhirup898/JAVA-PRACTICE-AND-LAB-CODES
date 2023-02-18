import java.util.Scanner;  
public class sumofdigits   
{  
public static void main(String args[])  
{  
int number, digit, sum = 0;  
Scanner SC = new Scanner(System.in);  
System.out.print("Enter the number: ");  
number = SC.nextInt();  
while(number > 0)  
{  
    
digit = number % 10;  

sum = sum + digit;  
 
number = number / 10;  
}  

System.out.println("Sum of Digits: "+sum);
SC.close();  
}  

}  

