package chaodaima.day06;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //张三javaSe成绩达到98 奖励电脑一台 否则罚抄写代码100遍
        int javaSe=99;
        if (javaSe>98){
            System.out.println("奖励电脑一台");
        }else {
            System.out.println("罚抄写代码100遍");
        }


        Scanner sc=new Scanner(System.in);
        int num=8;
        if (num<10){
            System.out.println("请输入性别");
            String sex=sc.next();
            if (sex.equals("男")){
                System.out.println("进入男子组");
            }else {
                System.out.println("进入女子组");
            }
             // equals 只是比较字符串    数据 必需使用==
        }else {
            System.out.println("退出比赛");


        }
    }
}
