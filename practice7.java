

import java.util.Scanner;
public class practice7 {
    public static void main(String[] args) {
        //math class
        System.out.println(Math.max(5,6));
        System.out.println(Math.min(5,2));
        System.out.println((int)Math.random()*100);
        Scanner sc = new Scanner(System.in);
        System.out.println("input your name");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("input your name");
        float b = sc.nextFloat();
        System.out.println(b);
        System.out.println("input your name");
        String c = sc.next();
        System.out.println(c);
        System.out.println("input your name");
        String d= sc.nextLine();
        System.out.println(d);
        sc.close();
    }
}
