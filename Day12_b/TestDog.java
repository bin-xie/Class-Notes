package Notes.Day12_b;

public class TestDog {
    public static void main(String[] args) {

    /*Dog dog=new Dog();

    //调用普通方法
    dog.getNum();
    //dog.Dog();  //不能像普通方法那样被调用，会报错*/


       /* Dog dog=new Dog("传一个值");

        Dog dog1 = new Dog();*/

       Dog dog = new Dog("小白",100,100,"品种1");

        System.out.println(dog.name);
        System.out.println(dog.health);
        System.out.println(dog.love);
    }
}
