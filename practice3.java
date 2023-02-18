

import java.util.Arrays;

public class practice3 {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 95;
        marks[1] = 96;
        marks[2] = 90;
        System.out.println(marks[0]);

        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks.length);
    }
}
