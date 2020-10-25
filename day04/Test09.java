package Notes.day04;

/**
 * if选择结构
 */
public class Test09 {
    public static void main(String[] args) {
        //如果zhangSan的成绩大于98 奖励笔记电脑一台

        int zhangSan =100;
        boolean b = zhangSan>98;     //zhangSan的成绩大于98
        System.out.println(b);

        if(zhangSan>98){            //if(括号里面只能是boolean)
            System.out.println("奖励笔记电脑一台");
        }
        System.out.println("程序结束 ");
    }
}
