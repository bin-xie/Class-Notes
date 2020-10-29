package Notes.day09;
/**复习
 * 打印99乘法表
 */
public class Test01 {
    public static void main(String[] args) {
        /*for (int i=0;i<9;i++){
            System.out.println(i+1);
        }
        for (;;) {
            System.out.printf(i + 1);       //死循环
        }*/

        /**
         * 打印99乘法表
         */
        for (int i=1;i<=9;i++){
            //System.out.println(i);
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
         }

        //倒过来
        /*for (int i=9;i>=1;i--) {
            //System.out.println(i);
            for (int j = 9; j >= i; j--) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }*/
    }
}
