package Notes.Emphasis;

/**
 * if
 */
public class Test05 {

    //给一个条件 如果成绩大于80良好  60-80（包括60)中等   小于60差
    public static void main(String[] args) {

        int javaSe=80;
        if (javaSe>80){     //不包括80 如果要等于80需要加上=
            System.out.println("良好");
        }
        else if (javaSe>=60) {
            System.out.println("中等");
        }
        else {
            System.out.println("差");
        }
    }
}
