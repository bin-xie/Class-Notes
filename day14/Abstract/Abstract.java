package Notes.day14.Abstract;

/**
 * 抽象 ：  abstract
 *  1.类中有抽象abstract方法的 必须为抽象类
 *  2.抽象方法不能有方法体{}  直接用分号；结束
 *  3.抽象类不能 new对象  但子类可以调用构造方法
 *  4.抽象类中的所有抽象方法必须被子类实现
 *  5.abstract不能加 final修饰符
 */
public  class Abstract {   //加了abstract就变成抽象类
    public static void main(String[] args) {
       // TestAbstract ab=new TestAbstract();  //抽象类不能 new对象
        Test2Abstract ab=new Test2Abstract();
        ab.deleteUser();
    }
}

//======父类===============================================

abstract class TestAbstract{
    public void addUser(){}  //普通方法
    public abstract void deleteUser();
}
//------子类-----------------------------------------------
/**
 * 如果继承了抽象类，有两种方法 ：
 *  1.自己也修改为抽象类
 *  2.实现父类的所有抽象方法
 */
// 第一种方法
//abstract class Test2Abstract extends TestAbstract{}

// 第二种方法
 class Test2Abstract extends TestAbstract{    //抽象类只能继承一个

    // @Override  不写也可以，默认就是它
    public  void deleteUser(){
        System.out.println("重写父类方法");
    }

}
