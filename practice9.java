
import java.util.*;
class xyz{
    int i,j;
    int get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of i and j");
        //int i= sc.nextInt();
        //int j= sc.nextInt();
       
        sc.close();
        return 0;
        
    }
    void display(){
        System.out.println("i ="+i + "j =" +j);

    }
}

 class practice9 {
    public static void main(String[] args) {
        xyz x1 = new xyz();
        x1.get();
        x1.display();

    }
}
