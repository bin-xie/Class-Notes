package Notes.day13_a;

public class StaticDemo03_1 {
    public static void main(String[] args) {

        //之前调用 StaticDemo03中的属性或方法需要new对象
        //之前的调用方式 就算你加了static修饰一样的调用
        StaticDemo03 s2  = new StaticDemo03();
        System.out.println(s2.a);
        System.out.println(s2.b);
        s2.getA();
        s2.getB();

//------------------------------------------------

        //static修饰的可以直接类名.属性名 或 类名.方法名（）
        System.out.println(StaticDemo03.b);
        StaticDemo03.getB();

        //如果没有通过static修饰的能不能访问，没有创建对象  不能
        //System.out.println(StaticDemo03.a);
        //StaticDemo03.getA();

        //static修饰的方法，我们称之为工具方法，因为他不需要实例化   比如有Math.random()等等
        Math.random();

    }
}
