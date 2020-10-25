package Notes.day04;

/**
 * day作业
 */
public class Test03 {
    public static void main(String[] args) {
        //46天   等于?周  剩余多少天
        int day=46;//总共多天
        int week=day/7;//求出多少周
        int leftDay=day%7;//剩余多少天
            System.out.println(day+"天等于"+week+"周剩余"+leftDay+"天");
    }
}
