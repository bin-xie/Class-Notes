package Notes.day06;

public class Test05 {
    public static void main(String[] args) {
       /* //long double  boolean   witch不可可以用
        //byte short char int String ENUM 枚举  switch可以用
        double num =1.22;
        switch (num){
       }*/
       int num=1;
       switch (num){
           case 1:
               System.out.println("星期一");
               /* case 1:      //两个值 不以相同，必需代代唯一
               System.out.println("星期一");*/
           case2:
               System.out.println("星期二");
           case 3:
               System.out.println("星期三");
           case 4:
               System.out.println("星期四");
               break;       //break 就是跳出当前 switch选择结构
           case 5:
               System.out.println("星期五");
           case 6:
               System.out.println("星期六");
           default:
               System.out.println("星期天");
       }
    }
}
