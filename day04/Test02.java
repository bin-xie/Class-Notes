package Notes.day04;

public class Test02 {
    public static void main(String[] args) {
        //%取余数  先除  再取余数
        int num = 5%2;//结果为1
        System.out.println(num);

        int num2 =13%2;//结果也为1
        System.out.println(num2);

        int num3 = 6%3;//结果为0
        System.out.println(num3);

        System.out.println("-------------");
        int i =7;
        i++;   //相当于 i+1   7+1;
        System.out.println("i的值为"+i);    //结果 8
        i++;
        System.out.println("i的值为"+i);    //结果 9
        i--;   //相当于  i-1;
        System.out.println("i的值为"+i);    //结果 8


        int num5=6;
        num5+=1;     //相当于  num5 +1;    结果 7
        System.out.println("num5的值为"+num5);
        num5-=1;     //相当于  num5 -1;    结果 6
        System.out.println("num5的值为"+num5);
    }
}
