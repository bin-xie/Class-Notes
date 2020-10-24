package Notes.Emphasis;

/**
 * while循环
 */
public class Test09 {
    public static void main(String[] args) {
        String str1="y";   //张三
        String str2="n";   //张三
        /*while (str1.equals(str2)){
            System.out.println("都是张三时，会执行，但死循环。  变成yn时死循环");
        }*/
        while (!str1.equals(str2)){
            System.out.println("变成yn时，会执行，但死循环。  ");
            break;  //见到break跳出循环
            //在实际开发过程中 通常在while循环里面是不会使用 break;
        }

        System.out.println("执行了没有");

        System.out.println("do ... while  开发过程中根本就不用");

        /*do {
            System.out.println("不管条件成不成立，我都将执行一次");
        }while (false);*/
        /*do {
            System.out.println("死循环");   //死循环
        }while (true);*/

        String str3 ="y";//     y   y
        String str4 = "n";//   y   n
        do {
            System.out.println("请问这里是什么情况?死循环");

            // }while (str3.equals(str4));   //执行一次
        }while (!str3.equals(str4));   //死循环


    }
}
