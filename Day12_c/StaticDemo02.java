package Notes.Day12_c;

public class StaticDemo02 {
    //这是普通属性
    public  int i=0;
    //这是静态属性
    public static int b=0;

    //通过构造方法进行业务操作
    public StaticDemo02(){
        i++;//相当于 i= i+1
        b++;
    }
}
