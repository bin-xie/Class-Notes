package Notes.day14.AccessModifier;

public class AccessModifier {
    private String name1="张三1";      //
    String name2="张三2";              //默认修饰符
    protected String name3="张三3";    //受保护的
    public String name4="张三4";       //

    public static void main(String[] args){
        AccessModifier am=new AccessModifier();
        //本类所有修饰符都可访问
        System.out.println(am.name1);
        System.out.println(am.name2);
        System.out.println(am.name3);
        System.out.println(am.name4);


    }
}
