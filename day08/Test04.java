package chaodaima.day08;

import java.util.IllegalFormatCodePointException;

public class Test04 {
    public static void main(String[] args) {
        //通过for循环求 1~100的奇数和
        int num=0;
        for (int i=0;i<100;i++){           //也可以   i=1  i<=100
            if (i%2!=0){                   //判断  是否是奇数    是奇数才会进来
                num=num+i;                 //num+=i   //相加
            }
        }
        System.out.println("1~100的奇数和为:"+num);
    }
}
