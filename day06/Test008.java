package Notes.day06;
/**
 * switch选择结构
 */
public class Test008 {
    public static void main(String[] args) {
        /**
         * 一周菜谱
         */
       /* int weekday = 6;
        switch (weekday){
            case 1:
                System.out.println("牛肉面");
                break;
            case 2:
                System.out.println("炸酱面");
                break;
            case 3:
                System.out.println("海底捞");
                break;
            case 4:
                System.out.println("热干面");
                break;
            case 5:
                System.out.println("炸酱面");
                break;
            case 6:
                System.out.println("炸酱面");
                break;
            case 7:
                System.out.println("汤粉");
                break;
            default:
                System.out.println("录入有误，请输入1~7之间的数字");
                break;

        }*/

        //一周菜谱
        int weekday = 9;
        switch (weekday){
            case 1:
                System.out.println("牛肉面");
                break;
            case 2:
            case 5:
            case 6:
                System.out.println("炸酱面");
                break;
            case 3:
                System.out.println("海底捞");
                break;
            case 4:
                System.out.println("热干面");
                break;
            case 7:
                System.out.println("汤粉");
                break;
            default:
                System.out.println("录入有误，请输入1~7之间的数字");
                break;
        }
        System.out.println("程序结束");
    }

}
