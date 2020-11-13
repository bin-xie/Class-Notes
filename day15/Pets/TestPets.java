package Notes.day15.Pets;

public class TestPets {
    public static void main(String[] args) {
        //1.创建主人类
        Master ma=new Master();

        /*//2.给狗狗喂食——>这里需要一个参数，参数类型为Dog对象
        Dog dog=new Dog();
        ma.feed(dog);

        //3.打印输出信息
        dog.print();*/

        //給企鹅喂食
        ma.feed(new Penguin());
    }
}
