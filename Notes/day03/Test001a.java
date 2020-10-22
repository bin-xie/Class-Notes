package chaodaima.day03;
/*
 * 变量
 * */
public class Test001a {
    //程序主入口
    public static void main(String[] args) {
        /*
        *  定义变量第一种方式
        *  1.先定义 先声明  不赋值   不可以直接访问，会报错
        *  int 数据类型   num 变量名，可以的随便取
        * */
        int num;
        // 2.再赋值
        num=100;
        // System.out.println("值为"+"num");      //输出的值不能加双引号
        System.out.println("值为"+num);


        //定义变量第二种方式
        //直接声明并赋值
        int money=1000;
        System.out.println(money);
    }

}
