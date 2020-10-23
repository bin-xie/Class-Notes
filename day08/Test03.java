package chaodaima.day08;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
         //录入 张三的5门成绩  并求平均分
        Scanner sc=new Scanner(System.in);
        double num=0;      //num  总成绩
        for (int i=1;i<=5;i++){
            System.out.println("请录入第"+i+"门成绩");
            double score=sc.nextInt();
            num+=score;
        }
        System.out.println("张三的总成绩为："+num);
        System.out.println("张三的平均分为："+(num/5));
    }
}
