package Notes.day08;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        /**
         * 人机猜拳（1.剪刀、2.石头、3.布）
         */
        Scanner input=new Scanner(System.in);

        int pCount=0;   //电脑计数器
        int cCount=0;   //玩家计数器
        for (int i=1;i<=3;){
            int computer=(((int)(Math.random()*10))%3+1);
            System.out.println("请输入猜拳的编号（1.剪刀、2.石头、3.布）：");
            int piayer=input.nextInt();
            //比较
            if (computer==piayer){
                System.out.println("不错哦，再接再厉！");
                continue;
            }else if ((piayer==1 && computer==3) || (piayer==1 && computer==3) || (piayer==1 && computer==3)) {
                System.out.println("恭喜，大神");
                pCount++;
            }else {
                System.out.println("哎呀，你也不行啊，给你机会你也不中用啊！");
                cCount++;
            }
            if (cCount==2 || pCount==2){
                break;
            }
            i++;
        }
    }
}
