package Notes.day04;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        //sc是变量名，可以随便取
        Scanner sc=new Scanner(System.in);

        System.out.println("请输出张三的成绩");
        int zhangSan = sc.nextInt();
        System.out.println("请输出李四的成绩");
        int liSi = sc.nextInt();
        System.out.println(zhangSan == liSi);

        //System.out.println(zhangSan != liSi);    // != 取反
        boolean b = zhangSan != liSi;        //可以定义变量接收
        System.out.println(b);
    }
}
