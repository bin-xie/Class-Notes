package Notes.day11;

/**
 * 1.发现类  Dog
 * 2.发现属性
 * 3.发现行为
 */
public class Dog {   //public 共工公开  class 类
    //发现属性
    public String name="呢称1";
    public int health=100;  //健康值
    public int love=100;    //与主人亲密度
    public String strain="品种1";

    //3.发现行为  就是方法
    public void run(){         //viod 返回值   run方法名（括号以后可以传参数）
        System.out.println("跑呀跑");
    }
    public void sleep(){
        System.out.println("睡呀睡");
    }

    /**
     * void 就是我什么也不返回
     * 定义方法
     * int 返回类型
     */
    public int getNum(){
        System.out.println("经过开发过程中这里有很多代码");
        return 10;
    }
    public String getStr(){
        System.out.println("不管你这里面怎么操作，我就要一个String类型的结果");
        return "给你个引用类型";
    }
    /**
     * 谁调用我 就必须要给我一个参数，我的参数类型是 String
     * @param name1  参数一个
     * @return
     */
    public String getStr2(String name1){
        System.out.println("这里面有一个参数"+name1);
        return "getStr2";
    }
    public String getStr3(String nam1,int num){
        System.out.println("这里面有一个参数"+nam1);
        return nam1;
    }

   /* public int getnNum2(){
          reture (3+4); //可以这么写，必须用括号括起来
    }*/

    //--------------------------------------------------
    //这就是一个方法
    public void print(){
        System.out.println("宠物的自白：我的名字叫："+name+"\t与主人的亲密度"
                           +love+"\t健康值为："+health);
    }

    //--------------------------------------
    public static void main(String[] args){
        //现在是要调用Dog中的方法或属性
        //new对象 实例化 创建对象 dogdbq 变量名随便取的
        Dog dogdbq=new Dog();
        //调用 Dog中的 name属性 dogdbq.属性名
        System.out.println(dogdbq.name);
        System.out.println(dogdbq.health);
        //调用Dog中的run方法  通过变量名.方法名（）;
        dogdbq.run();
        //修改 name属性的值 变量名.属性名="你的值";
        dogdbq.name="刚修改的值";
        System.out.println(dogdbq.name);

        dogdbq.health=10;
        System.out.println(dogdbq.health);






    }



}
