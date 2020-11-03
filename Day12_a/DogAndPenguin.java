package Notes.Day12_a;

import java.util.Scanner;

public class DogAndPenguin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("欢迎您来到宠物店！");
        System.out.print("请输入要领养宠物的名字：");
        String name = input.next();
        System.out.print("请选择要领养的宠物类型：（1.狗狗\t 2.企鹅）");
        int type = input.nextInt();

        if (type == 1) {
            //1.创建狗狗对象
            Dog dog = new Dog();
            //2.给Dog赋值
            dog.name = name;
            //3.调用方法（输出打印）
            dog.print();
        } else if (type == 2) {
            //1.创建企鹅对象
            Penguin pen = new Penguin();
            //2.给penguin赋值
            pen.name = name;
            //3.调用方法（输出打印）
            pen.print();
        } else {
            System.out.println("您的输入有误");
        }
    }
}
