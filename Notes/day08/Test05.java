package chaodaima.day08;

import java.util.Scanner;

public class Test05 {
    // 输出一个值  输出加发表
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个值");
        int val=sc.nextInt();          //val 值
        // int i=0,j=val可以定义多个变量，通过，
        for (int i=0,j=val;i<=val;i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));
        }
    }
}
