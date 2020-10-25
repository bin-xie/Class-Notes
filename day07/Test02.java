package Notes.day07;

/**
 * while循环
 */
public class Test02 {
    public static void main(String[] args) {
        //写100遍 好好学习,天天向上
        /*System.out.println("好好学习,天天向上1");
        System.out.println("此处省略。。。。");
        System.out.println("好好学习,天天向上100");*/

        //写100遍 好好学习,天天向上
        /* int num =1;
        while (num<=100){
            System.out.println("第"+num+"次好好学习,天天向上");
            num++;
        }*/

       /* int num=0;
        while (true) {      //只要条件成立就会执行{这里的代码}
            System.out.println("死循环");      //这个注释里是死循环
        }*/
        /*int num=0;
        while (num<100) {       //条件为真的条件下才会被执行
            System.out.println("第" + (num + 1) + "次好好学习，天天向上");
            //很多同学忘记写 num++ 导致死循环
            num++;              //num++=num+1;
        }*/

            int num=100;
            while (num>=1){      //为真的条件下才会被执行
                System.out.println("第"+num+"次好好学习，天天向上");
                //很多同学忘记写 num++ 导致死循环
                num--;
            }
    }
}
