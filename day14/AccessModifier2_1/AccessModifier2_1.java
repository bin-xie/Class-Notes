package Notes.day14.AccessModifier2_1;

import Notes.day14.AccessModifier.AccessModifier;

public class AccessModifier2_1 {
    public static void main(String[] args) {

        AccessModifier am=new AccessModifier();
        //不同包只能访问  public
        /*System.out.println(am.name1);   //访问报错
        System.out.println(am.name2);   //访问报错
        System.out.println(am.name3);*/   //访问报错
        System.out.println(am.name4);
    }
}
