package Notes.Emphasis;

import java.util.Scanner;

/**
 * 两个值得比较   以后开发过程中：
 *                  如果是数字就用==   数字比较是不能用equals的
 *                  如果是字符串就用equals
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*System.out.println("请输入第一个数字");
        int num1=sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2=sc.nextInt();

        if (num1==num2){
            System.out.println("等于");
        }*/


        System.out.println("请输入第一个字符串");
        String str1=sc.next();
        System.out.println("请输入第二个字符串");
        String str2=sc.next();

        if (str1.equals(str2)){       //不能用==
            System.out.println("等于");
        }
    }
}
