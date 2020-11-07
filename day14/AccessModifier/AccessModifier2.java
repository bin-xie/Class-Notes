package Notes.day14.AccessModifier;

public class AccessModifier2 {
    public static void main(String[] args) {
        //同包不同类
        AccessModifier am=new AccessModifier();
        //同包不同类 private 修饰符不可访问
        //System.out.println(am.name1);   //访问报错
        System.out.println(am.name2);
        System.out.println(am.name3);
        System.out.println(am.name4);
    }
}
