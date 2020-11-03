package Notes.Day12_a;

public class Penguin {
    String name;   //姓名
    int health;    //健康值
    int love;      //亲密度
    String sex;    //性别

    public void print(){
        System.out.println("宠物的自白：我的名字叫："+name+"\t与主人的亲密度"+
                           love+"\t健康值为"+health+"\t性别为"+sex);
    }
}
