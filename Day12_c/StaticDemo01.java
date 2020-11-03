package Notes.Day12_c;

public class StaticDemo01 {
    //创建构造方法
    public  StaticDemo01(){
        System.out.println( "我是new对象时被调用1");
    }

    //静态代码块  在类加载之前被调用
    static {       //static属于类
        System.out.println("在类加载之前被调用2");
    }




//===================================================
    //代码块，不用.在new对象之前被调用
   /* {
        System.out.println("在new对象之前被调用");
    }*/
}
