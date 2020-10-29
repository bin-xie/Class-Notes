package Notes.day08;

public class Test004 {
    /**
     * 通过while循环求 1~100的奇数和与偶数和
     * 通过while循环求 1~100的能被3整除的数之和
     */
    public static void main(String[] args) {
        /*int i=2;
        int sum=0;
        while (i<=100){
            sum+=i;
            i+=2;
        }
        System.out.println("奇数和："+sum);*/

        /*int i=1;
        int sum=0;
        while (i<=100){
            sum+=i;
            i+=2;
        }*/
        /* int i=1;
        int sum=0;
        while (i<=100){
            if (i%2==0 ) {      //等等于就是偶数和  不等于就是奇数和
                sum += i;
            }
            i++;
        }
        System.out.println("偶数和："+sum);*/

        /**
         * 通过while循环求 1~100的能被3整除的数之和
         */
        int i=1;
        int sum=0;
        while (i<=100){
            if (i%3==0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
