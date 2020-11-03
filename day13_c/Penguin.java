package Notes.day13_c;
//企鹅继承  了  Pet
public class Penguin extends Pet{

    //继承就相当于有了这些 非私有修饰的属性
   /* public String name="昵称1";
    public int health=100;//健康值
    public int love =100;//与主人亲密度*/
    public  String sex="Q妹";

    /**
     * //重写了父类的方法
     *   super：父类的意思————要看我这个类继承了哪个类
     * 1.super可以访问父类的的成员 或 方法
     * 2.super在普通方法可以任意位置
     * 3.super在构造方法只能位于第一次
     * 4.super不能访问父类private修饰成员
     * 5.静态方法中不能使用super和this关键字
     * super可以调用父类任何非private修饰成员和方法
     */
    //@Override——这一个可以写可以不写      //我要重写父类的方法了

    //j假设企鹅会飞、也会跑、重写——去解决这个问题
    public void run(){
        super.run();  //父类调用
        //System.out.println("跑呀跑");
        System.out.println("飞呀飞");
        // System.out.println("跑呀跑");
        super.run();
        System.out.println(super.health);
        // System.out.println(super.ccc); //不能访问
        // System.out.println(super.ddd);
    }
//--------------------------------------------------------
    //静态方法中不能使用super和this关键字
    public static void getA(){
        // System.out.println(super.health);   //不能使用this
    }
//--------------------------------------------------------
    //其它方法也是可以使用super
    public void getC(){
        System.out.println(super.health);
    }


}
