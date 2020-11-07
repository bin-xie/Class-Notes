package Notes.day14.Final;

/**
 * Final
 * final ： 最终的意思 ，不能被重写、修改
 */
public class Final {
    public static void main(String[] args) {
        int i=10;
        i=20;  //这样是可以修改的

        final int MAX_ID=100;
        //MAX_ID=10;  //加了final后 值就不能被修改了
    }
}

//=======与下方无关系=========================================
/**
 * 人类不想被任何继承
 * final 最终的意思 ，不能被重写
 */
//final class Person{   //人类不想被任何继承,在class前加final
class Person{
    //加了final就不能被重写了
    public final void add(){

    }
}

//-----------------------------------------------

/**
 * 老师继承人类
 */
//class Teacher extends Person{  //报错，不能继承，因为父类加了final
class Teacher extends Person{
    /*@Override  //重写了父类
    public void add(){    //父类加了final就不能被重写了

    }*/
}