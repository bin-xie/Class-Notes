package Notes.day14.MultipleInheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        Student st=new Student();
    }
}

//===========================================================

class Person{    // 人类
    public String name="人类";

    public Person(){
        super();
        System.out.println("人类1");
    }
}
//------------------------------------------------------
// 老师继承了人类
class Teacher extends Person{   //老师
    public String name="老师";

    public Teacher(){
        super();
        System.out.println("老师类2");
    }
}
//----------------------------------------------------------
// 学生继承了老师
class Student extends Teacher{    // 学生
    public String name="学生";
    //这是无参构造方法
    public Student(){
        super();  //这是一个调用父类的构造方法，super必须位于第一位
        System.out.println("学生类3");
    }
}