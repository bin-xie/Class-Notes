package Notes.day04;

/**
 * 自动类型转换
 */
public class Test04 {
    public static void main(String[] args) {
        /* double num2 = 99999999*888888888;
        System.out.println(num2);*/

        //自动类型转换
        int num =10;
        double num2=num;      //这个就是自动类型转换
        System.out.println(num2);
        //int num3=num2;      //因为这个是把大的转成小的就不可以

        //必需强制转换，这也叫强制类型转换
        //强制转换会损失精度
        int num4=(int)num2;
        System.out.println("强转后的值为"+num4);
        double num5=12.66;
        int num6=(int)num5;
        System.out.println(num6);

    }
}
