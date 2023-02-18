

class xyz {
    int i, j;

    xyz() {
        i = 0;
        j = 0;

    }

    xyz(int p) {
        i = p;
        j = p + 1;

    }

    xyz(int p, int q) {
        i = p;
        j = q;
    }
}

public class practice10 {
    public static void main(String[] args) {
         xyz x1 = new xyz();
         xyz x2 = new xyz(3);
         xyz x3 = new xyz(4,5);
         System.out.println(x1);
         System.out.println(x2);
         System.out.println(x3);
         
    }
}
