package Notes.day13_a;

/**
 * 1.本类中的普通方法中可以调用静态属性与非静态属性
 * 2.静态方法中，只能访问静态修饰的属性，不能访问非静态修饰的属性
 * 3.不管是静态方法还是普通方法都 可以 定义普通属性  非static修饰的属性
 * 4.不管是静态方法还是普通方法都 不可以 定义static修饰的属性  因为statci属于类
 * 5.静态方法不能使用this和super   super后面会重点讲
 * 6.static修饰的方法，我们称之为工具方法，因为他不需要实例化   比如有Math.random()等等
 */
public class StaticDemo03 {

    //定义一个普通属性 ，成员变量
    public int a=0;
    //定义一个静态变量
    public  static int   b=0;

    //定义普通方法
    public void getA(){
        //本类中的普通方法中可以调用静态属性与非静态属性
        /*System.out.println(a);
        System.out.println(b);*/

        int c=10;
        //static int  d=30; 不管是静态方法还是普通方法 都不可以定义   static修饰的属性  因为statci属于类
        //普通方法可以使用this
        System.out.println(this.a);
    }
    //定义静态方法
    public static void getB(){
        //静态方法中，只能访问静态修饰的属性，不能访问非静态修饰的属性
        //System.out.println(a);
        System.out.println(b);

        int c=10;
        //不管是静态方法还是普通方法 都不可以定义   static修饰的属性  因为statci属于类
        //static int  d=30;
        //静态方法不能使用this 和super   super后面会重点讲
        //System.out.println(this.a);
        System.out.println("调用了静态方法");
    }

}
