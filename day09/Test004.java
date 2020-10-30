package Notes.day09;

import java.util.Scanner;

public class Test004 {
    public static void main(String[] args) {
        /**
         * 控制台录入5名学生成绩，并保存在数组中
         */
        Scanner input = new Scanner(System.in);

        double[] scores = new double[2];

        //存
        for (int i=0;i<scores.length;i++){
            System.out.println("前输入第"+(i+1)+"名名学生成绩");
            scores[i] = input.nextDouble();
        }
        //取
        for (int i=0;i<scores.length;i++) {
            System.out.println(scores[i]);
        }
    }
}
