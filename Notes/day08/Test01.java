package chaodaima.day08;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
       /* while (true){                             //必须是条件成立  为真才会执行
            System.out.println("一直死循环");
        }*/
       /* while (4>6){                                //条件不成立是不会执行的
            System.out.println("dd");
        }*/

        /*do {
            System.out.println("不管什么情况下都会执行一次的代码");
        }while (true); */   // true 死循环   false 不管什么情况下都会执行一次

       /* Scanner sc=new Scanner(System.in);
        String str=sc.next();
       do {
           System.out.println("不管什么情况下都会执行一次的代码");
           System.out.println("请输入值");
           str=sc.next();
       }while (!"y".equals(str));
*/

        //今年招生人数20000
        int yeay =2020;
        int students=20000;
        //每年增长 25% 求出 多年之后达到100W
        while (students<1000000){
            students=(int)(students*(1+0.25));          // students=students*(1+0.25);强转为int
            yeay++;
        }
        System.out.println(yeay+"之后学员达到"+students);
    }
}
