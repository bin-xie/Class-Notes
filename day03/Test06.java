package Notes.day03;

import java.util.Scanner;

public class Test06 {
    /**
     * Scanner sc  = new Scanner(System.in);
     * sc 只是一个变量名，就这个就变量名可以随便写，其它固定写法
     * 一个main方法只，只需一个 Scanner就可以了
     */
    public static void main(String[] args) {

        //通过Scanner 接收用户输入的信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入张三的javaSe成绩");
        double se = sc.nextDouble();
        System.out.println("请输入张三的mysql成绩");
        double mysql=sc.nextDouble();
        System.out.println("请输入张三的web成绩");
        double web = sc.nextDouble();
        //求web 与mysql的成绩差
        System.out.println("求web 与mysql的成绩差"+(web-mysql));
        double avg = (web+mysql+se)/3;
        System.out.println("平均分为"+avg);
    }
}
