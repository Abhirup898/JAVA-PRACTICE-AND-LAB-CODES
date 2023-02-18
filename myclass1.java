/* for invoking static there is no requirement of creating object */
public class myclass1 {
    static{
        System.out.println("I am a  block1");
    }
    static{
        System.out.println("I am a instance block2");
    }

    public static void main(String[] args) {
        System.out.println("I am main block");
    }
}
