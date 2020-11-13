package Notes.day15.Pets;

public class Master {
    //给狗狗喂食
    public void feed(Dog dog) {
        //调用吃的方法即可
        dog.eat();
    }

    //給企鹅喂食
    public void feed(Penguin pen) {
        Penguin pen1 = new Penguin();
        //调用吃的方法即可
        pen.eat();
    }

}
