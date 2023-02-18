

public class practice2 {
    public static void main(String[] args) {
        String name = new String("abhirup");
        String neighbour ="timir";
        String officer = neighbour;
        System.out.println(name);
        System.out.println(neighbour);
        System.out.println(officer);
        System.out.println(officer.length());
        String name2 = name + "and" + neighbour;
        System.out.println(name2);
        System.out.println(name.charAt(2));
        System.out.println(name.replace('b','v'));
        String a ="abhirup and timir";
        System.out.println(a.substring(8,11));
    }
}
