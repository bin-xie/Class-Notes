package Notes.day05;

import java.util.Scanner;

public class Test05 {
    /**
     * 通过用户输入年龄
     * 18以下   听妈妈的话，好好学习
     * 18 - 30 爱干嘛就干嘛
     * 30 -50  结婚生子
     * 50 - 70 老实在家
     * 70以上   睡大马路
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("听妈妈的话，好好学习");
        }else if(age>=18 && age<30){
            System.out.println("爱干嘛就干嘛");
        }else  if(age>=30 && age<50){
            System.out.println("结婚生子");
        }else if(age>=50 && age<70){
            System.out.println("老实在家");
        }else {
            System.out.println("睡大马路");
        }
    }
}
