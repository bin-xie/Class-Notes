package Notes.day14.MultipleInheritance2;

/**
 * super和this不能同时存在于一个构造方法中，他们都是需要在构造方法第一位
 */
public class MultipleInheritance2 {
    public static void main(String[] args) {
        //Student st=new Student();
        Student st=new Student("人类1","老师2","学生3");
    }
}

//===========================================================

class Person{    // 人类
    public String pname="人类";

    public Person(){
        super();
        System.out.println("人类1");
    }
    public Person(String pname) {
        this.pname=pname;
        System.out.println("人类构造方法"+pname);

    }
}
//------------------------------------------------------
// 老师继承了人类
class Teacher extends Person {   //老师
    public String tname="老师";

    public Teacher(){
        super();
        System.out.println("老师类2");
    }
    public Teacher(String pname,String tname){
        super(pname);
        //this.tname=tname;
        System.out.println("老师类构造方法"+tname);
    }
}

//----------------------------------------------------------
// 学生继承了老师
class Student extends Teacher {    // 学生
    public String sname="学生";
    //这是无参构造方法
    public Student() {
        super();  //这是一个调用父类的构造方法，super必须位于第一位
        System.out.println("学生类3");
    }
    public Student(String pname,String tname,String sname){
        super(pname,tname);
        //this.sname=sname;
        System.out.println("学生类构造方法"+sname);

    }
}
