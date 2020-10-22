package chaodaima.day08;

public class Test08 {
    public static void main(String[] args) {
        /*for (int i=0;i<10;i++){
            if (i==5){
                continue;          // continue;只是跳出本次循环，下一粗次环继续
            }
            System.out.println("i的值为"+i);
        }*/

        int i=1;
        while (i<6){
            if (i==2){
                //如果是while就是死循环
                i++;              //加上这个就不会是死循环
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
