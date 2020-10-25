package Notes.day07;

import java.util.Scanner;

/**
 * do..while循环：1.是先运行，在判断
 *               2.do里面不管任何条件都会执行一次
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //do while
        //需求，先做题 然后老师在检查

        /*do {     //do里面不管条件成不成立都会执行一次
            System.out.println("张三写好了一道题目");
        }while (true);*/

                   //do while是先运行，在判断
        /*do {     //do里不管条件成不成立都会执行一次
            System.out.println("张三写好了一道题目");
        }while (false);*/

        String answer=null;
        do {     //do里不管条件成不成立都会执行一次
            System.out.println("张三写好了一道题目");
            System.out.println("是否合格了 y/n");
            answer=sc.next();
        }while (!"y".equals(answer));
        System.out.println("合格了，可以休息了");
    }
}
