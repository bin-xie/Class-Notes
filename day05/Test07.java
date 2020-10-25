package Notes.day05;

import java.util.Scanner;

/**
 *  if(str.equals(str2)){}
 *  1.一般用于字符串的比较，数字不可以使用equals
 *  2. 以后开发过程程只要是字符串比较使用 equals就没错
 */
public class Test07 {
    public static void main(String[] args) {
         /* if (){
            if (){
               if(){           //这个就是嵌套
            }
        }*/

        int num1=10;
        int num2=10;
        if(num1==num2){
            System.out.println("输出了");
        }
        String str = "abc";
        String str2 ="abc";
      /* if(str==str2){
           System.out.println( "str输出了没有");
       }*/
        if(str.equals(str2)){
            System.out.println( "str输出了没有");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str3 = sc.next();            //它就是接收String
        if(str==str3){
            System.out.println("str3输出了没有");
        }

        //等等于  是比较值的
        //如果是我们通过键盘输入(用户输入)的不要通过==去比较
        //只要是String类型的 比较就用这种方法
        if(str.equals(str3)){
            System.out.println("比较两个不同内存空间的值输出了");
        }
    }
}
