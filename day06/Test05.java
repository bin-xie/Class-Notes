package chaodaima.day06;

public class Test05 {
    public static void main(String[] args) {
       /* long double  boolean不可以
        byte short char int String ENUM  枚举 开发不会用，面试根本不会提
        double num =1.22;
        switch (num){
       }*/
       int num=3;
       switch (num){
           case 1:
               System.out.println("星期一");
               /* case 1:      //两个值 不以相同，必需代代唯一
               System.out.println("星期二");*/
           case2:
               System.out.println("星期二");
           case 3:
               System.out.println("星期三");
           case 4:
               System.out.println("星期四");
               break;     //break 就是跳出当前 switch选择结构
           case 5:
               System.out.println("星期五");
           case 6:
               System.out.println("星期六");
           default:
               System.out.println("星期天");
       }
    }
}
