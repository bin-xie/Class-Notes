package chaodaima.day06;

public class Test04 {
    /**
     *  张三参加计算机编程大赛
     *  如果获得第一名，将参加大学组织夏令营一个月
     *  如果获得第二名， 奖励电脑一台
     *  如果获得第二名 ,奖励移动硬盘一个
     *  否则，无任何奖励
     */
    public static void main(String[] args) {
        int mingCi=4;   //名次
        switch (mingCi) {
            case 1:
                System.out.println("参加大学组织夏令营一个月");
                break;
            case 2:
                System.out.println("奖励电脑一台");
                break;
            case 3:
                System.out.println("奖励移动硬盘一个");
                break;
            default:
                System.out.println("无任何奖励");
            //System.out.println("最后执行");  这里是不可以写代码的
        }
        System.out.println("最后执行");
    }
}
