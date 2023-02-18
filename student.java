public class student {
    String name;
    int age;
    student(String n,int a){
        name=n;
        age=a;

    }
   
    
    public static void main(String args[]){
        student mystudent =new student("Abhirup",100);
        System.out.println(mystudent.age);
        System.out.println(mystudent.name);

    }
}
