package Notes.day05;

/**
 * if-else选择结构
 * 如果javaSe成绩大于98  奖励电脑一台  否则 抄写代码100遍
 */
public class Test03 {
    public static void main(String[] args) {

        //如果javaSe成绩大于98  奖励电脑一台  否则 抄写代码100遍

        /*int javaSe=99;
        if(javaSe>98){
            System.out.println("奖励电脑一台");
        }
        else{
        }*/

        int javaSe=97;
        if(javaSe>98){
            System.out.println("奖励电脑一台");
        }else{
            System.out.println("抄写代码100遍");
        }

        System.out.println("都会执行的");
    }
}
