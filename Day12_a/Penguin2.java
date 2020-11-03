package Notes.Day12_a;

public class Penguin2 {
    public static void main(String[] args) {
        //1.创建new对象
        Penguin pen=new Penguin();

        System.out.println(pen.name);
        System.out.println(pen.health);

        //2.赋值
        pen.name="企鹅";
        pen.health=100;
        System.out.println(pen.name);
        System.out.println(pen.health);


        Penguin pen2=new Penguin();
        pen2.name="企鹅2";
        pen2.health=50;
        System.out.println(pen2.name);
        System.out.println(pen2.health);
    }
}
