package Notes.day06;

import java.util.Scanner;

public class Test02 {
    //这是全局变量  后面课程会重点讲这
    int num=9;
    public static void main(String[] args) {
        //只要是在方法里面的是局部变量
        Scanner sc=new Scanner(System.in);
        int num=9;
        if (num<10){
            String sex=sc.next();
            if (num<8){
                sex=sc.next();
            }
        }else {
            String sex=sc.next();
        }

    }
}
