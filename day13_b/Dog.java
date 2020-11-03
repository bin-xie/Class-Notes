package Notes.day13_b;
/**
 * 封装
 * 1.修饰符 修改为private  私有-就是只能自己访问
 * 2.生成 getter/setter方法 外部调的方法
 */
public class Dog {
    private String name="昵称1";
    private int health=100;//健康值
    private int love =100;//与主人亲密度
    private String strain="品种1";//品种
//------------------------------------------------
    private  boolean falg;
    //生成get方法
    public boolean isFalg(){    //一种规范，后面都这么写
        return falg;
    }
    public void setFalg(boolean falg){
        this.falg=falg;
    }
//-----------------------------------------
    //生成 getter/setter方法
    public void getA(){}//这就是一个方法
//-----------------------------------
    //name生成get
    public String getName(){
        //return  this.name;
        return  name;
    }
    //name生成set方法
    public void setName(String name_){
        //name=name_;
        this.name=name_;
    }
//--------------------------------------------------
    //健康值设置 get/set方法   private int health=100;//健康值
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        if (health<0){
            this.health=0;
            System.out.println("你传的值有误，请输入正确数值，不能为负数 ");
        }else{
            this.health=health;
        }
    }





    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.health);
    }

}
