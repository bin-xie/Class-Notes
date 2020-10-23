package chaodaima.day03;

public class Test02 {
    public static void main(String[] args) {
        // 1.先定义，先声明 不赋值  不可以直接访问，会报错
        int num;
        // 2.再赋值
        num=100;
        num=1000;
        System.out.println(num);
        // 一个方法，变量明必须代表唯一
        //int num1=10000;

        // 成绩 98.5
        double score=98.8;
        System.out.println("最高成绩"+score);
        // 姓名： 曾子
        String name="曾子";
        System.out.println("姓名为"+name);
        //性别：  男
        char sex='男';
        System.out.println("性别为"+sex);
    }
}
