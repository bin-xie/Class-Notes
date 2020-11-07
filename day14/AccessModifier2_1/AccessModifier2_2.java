package Notes.day14.AccessModifier2_1;

import Notes.day14.AccessModifier.AccessModifier;
// 继承了AccessModifier2
public class AccessModifier2_2 extends AccessModifier{
    public static void main(String[] args) {

        //创建对象必须是创建AccessModifier2_2
        AccessModifier2_2 am=new AccessModifier2_2();

        /*System.out.println(am.name1);   //访问报错
        System.out.println(am.name2); */  //访问报错

        //子类可以访问 默认修饰符与public
        System.out.println(am.name3);
        System.out.println(am.name4);
    }
}
