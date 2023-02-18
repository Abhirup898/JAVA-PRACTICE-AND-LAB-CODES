
class xyz{
    int a,b;
    void get(int p,int e){
        a=p;
        b=e;

    }
    void display(){
        System.out.println("a ="+a + "b ="+b);
    }
    xyz add(xyz a22){
        a22.a = a + a22.a;
        a22.b = a + a22.b;
        return (a22);
    }

}

public class practice8 {
    public static void main(String[] args) {
         xyz x3 = new xyz();
         xyz x1 = new xyz();
         xyz x2 = new xyz();
         x1.get(7,8);
         x1.display();
         x2.get(10,11);
         x2.display();
         x3=x1.add(x2);

         x3.display();

    }
}