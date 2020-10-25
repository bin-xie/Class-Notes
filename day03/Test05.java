package Notes.day03;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        //输入Scanner回车  或 Sc 回车
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=sc.next();   //接受你输入的字符串  sc是变量名可以随便取
        System.out.println("我输入的值为："+str);

        System.out.println("请输入数字");
        int num=sc.nextInt();
        System.out.println("数值为："+num);

        System.out.println("请输出双精度，请输入小数");
        double score=sc.nextDouble();
        System.out.println("值为："+score);
    }

}
