package Notes.Emphasis;

/**
 * while  for  do..while
 * 在开发过程中都是使用while  for
 * while 一般不知道循环次数的情况  就算知道循环次数也是可以使用的
 * for 在已知循环次数使用
 */
public class Test08 {
    public static void main(String[] args) {
        /*  while (true){//必需条件为真的情况下才会进来的
            System.out.println("现在是一个死循环");
        }*/

        /*int i=30;
        while (i>10){     //如果i小于10时，条件不成立，必须在外面定义
            System.out.println("i>10");
            i--;   //每次循环后i 的值 -1
        }*/

        //打印输出好好学习天天向上100次
       /* int i=0;
        while (i<100){//循环，只要条件为true就会进入到循环体

            //System.out.println(i);
            System.out.println(i+1);
            //每循环一次i+1
            i++;
        }*/

        int i=1;
        while (i<=100){//循环，只要条件为true就会进入到循环体
            //System.out.println(i);
            System.out.println(i);
            //每循环一次i+1
            i++;
        }
    }
}
