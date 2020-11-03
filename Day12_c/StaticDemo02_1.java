package Notes.Day12_c;

public class StaticDemo02_1 {
    public static void main(String[] args) {
        StaticDemo02 s1 = new StaticDemo02();
        StaticDemo02 s2 = new StaticDemo02();
        StaticDemo02 s3 = new StaticDemo02();
        System.out.println(s1.i);
        System.out.println(s2.i);
        System.out.println(s3.i);

        System.out.println(s1.b);
        System.out.println(s2.b);
        System.out.println(s3.b);

    }
}
