import java.util.Scanner;

public class lab2q1 {
    public static void main(String[] args) {
        int n, mx;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        mx = a[0];
        for (int i = 0; i < n; i++) {
            if (mx < a[i]) {
                mx = a[i];
            }
        }
        System.out.println("Maximum element in the array is:" +mx);
        sc.close();
    }
}
