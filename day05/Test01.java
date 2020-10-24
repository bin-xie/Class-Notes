package Notes.day05;

public class Test01 {
    public static void main(String[] args) {
        //% 先除  再取余数
        int i=5%2;//1
        System.out.println(i);//1

        int num=5;
        num++;//相当于 num+1;  6
        System.out.println(num);//6
        num--;//相当于 num-1
        System.out.println(num);//5

        //自动类型转换
        double num2=num;
        //强制类型转换
        int num3=(int)num2;

        boolean b=false;//boolean 只有两个值  ture真  false假

         if(!b) {
            System.out.println("进来了");
        }

        if (true) {
            System.out.println("");
        }

        System.out.println("后面的代码");


    }
}
