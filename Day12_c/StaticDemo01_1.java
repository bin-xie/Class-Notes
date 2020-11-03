package Notes.Day12_c;

public class StaticDemo01_1 {
    public static void main(String[] args) {
        StaticDemo01 s1 = new StaticDemo01();
        //类只会加载一次

        StaticDemo01 s2 = new StaticDemo01(); //只会输出一次
    }
}
