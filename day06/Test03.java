package chaodaima.day06;

public class Test03 {
    public static void main(String[] args) {
        /*
         *  张三参加计算机编程大赛
         *  如果获得第一名，将参加大学组织夏令营一个月
         *  如果获得第二名， 奖励电脑一台
         *  如果获得第二名 ,奖励移动硬盘一个
         *  否则，无任何奖励
         */
        int mingCi=4;    //名次
        if (mingCi==1){
            System.out.println("参加大学组织夏令营一个月");
        }else if (mingCi==2){
            System.out.println("奖励电脑一台");
        }else if (mingCi==3){
            System.out.println("奖励移动硬盘一个");
        }else{
            System.out.println("无任何奖励");
        }
    }
}