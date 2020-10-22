package chaodaima.day07;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
    //老师每天检查张浩的学习任务是否合格。如果不合格，则继续进行。
    //老师给张浩安排的每天的学习任务为：上午阅读教材，学习理论部分，下午上机编程，掌握代码部分
        Scanner sc=new Scanner(System.in);
        System.out.println("学习任务完成了吗  y/n");
        /*while (true){    //！就是取反     如果是true那就是false
            System.out.println("这个程序就是死循环");
        }*/
        String answer=sc.next();
        /*while (answer.equals("n")){
            //这里面如果没有完成才需要继续
            System.out.println("阅读代码，继续做题");
            //如果answer不变就会是死循环，老师必须检查
            System.out.println("老师在检查，学习任务完成了吗  y/n");
            answer=sc.next();*/

        //while (!answer.equals("y")){             //下面这么写也可以，把"y"与answer换下
        while (!"y".equals(answer)){
            //这里面如果没有完成才需要继续
            System.out.println("阅读代码，继续做题");
            //如果answer不变就会是死循环，老师必须检查
            System.out.println("老师在检查，学习任务完成了吗  y/n");
            answer=sc.next();




        }
        System.out.println("完成了，就休息吧");
    }
}
