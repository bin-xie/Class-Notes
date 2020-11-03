package Notes.day13_b;

public class Dog_1 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        //System.out.println(dog.name);  //私有-不能访问了
        //System.out.println(dog.health);//私有-不能访问了
//-------------------------------------------------
        System.out.println(dog.getName());
        //通过set方法设置值
        dog.setName("我传过去的值");
        //再次打印输出
        System.out.println(dog.getName());
//-----------------------------------------------
        //如何解决这一个问题 ,直接去setHealth中去解决
        //dog.setHealth(-1000);//可不可以传负数，不可以

        dog.setHealth(100);
        System.out.println(dog.getHealth());
    }
}
