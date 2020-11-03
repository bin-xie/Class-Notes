package Notes.day13_c;

public class Dog_1 {
    public static void main(String[] args) {
        //创建对象  实例化对象
        Dog dog=new Dog();

        System.out.println(dog.name);
        dog.run();

        Penguin pen = new Penguin();
        System.out.println(pen.name);
        pen.run();
    }
}
