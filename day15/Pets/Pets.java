package Notes.day15.Pets;

public abstract class Pets{
    String name="O";  //昵称
    int health=50;   //健康值
    int love=80;     //亲密度

    //定义一个抽象方法，负责宠物吃的功能
    public abstract void eat();
    //负责打印宠物输出信息
    public void print(){
        System.out.print("宠物的自白:"+"\n"+"我的昵称是:"+this.name+",与主人请密度为："+
                         +this.love+",健康值为："+this.health);
    }

    //生成get/set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}