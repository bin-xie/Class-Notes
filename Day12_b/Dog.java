package Notes.Day12_b;

public class Dog {
    /**
     * 构造方法特征
     * 1.无返回值
     * 2.构造方法必须与类名相同
     * 3.不能像普通方法那样被调用
     * 4.构造方法是在new对象时被调用
     * 5.如果我们没有创建系统 默认给我们创建一个无参的构造方法
     * 6.如果我们创建了构造方法，系统就不会给我们创建无参构造方法
     * 一般可以通过构造方法复制
     */

    String name;   //姓名
    int health;    //健康值
    int love;      //亲密度
    String Variety; //品种

    public Dog() {
        System.out.println("这是构造方法");
    }

    public Dog(String name) {
        System.out.println("有参构造方法，值为" + name);
    }

    //可以通过构造方法去赋值    //this代表当前类  不同的类对象不一样
    public Dog(String name, int health, int love22, String Variety) {
        this.name = name;    //this代表当前类  不同的类对象不一样
        health = health;   //不能这么些，值为默认值0
        love = love22;
        this.Variety = Variety;
    }

    /**
     * 方法重载特征
     * 1.普通方法可以重载，构造方法与可以重载
     * 2.与返回值无关
     * 3.方法名必须相同,才能叫重载
     * 4.与修饰符无关
     * 5.参数列表个数不同，或参数类型不同 。与变量名没有任何关系
     * 案例开发一个需求工程，就要查询某一个数据,有时候我没有传值， 有时个传一个，有时候传多个
     *
     *//*

    public   Dog(String name,int health){
    }
    public   Dog(int health,String name){   //这三个就是方法重载
    }
    public   Dog(int health,int love){
    }



    //这是一个普通方法
    public  int getNum(){
        System.out.println("我是普通方法");
        return  0;
    }*/

}
