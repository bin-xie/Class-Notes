package Notes.day13_c;
/**
 * Pet 父类
 * 继承
 * 1.把相同的代码全部抽取到父类
 * 2.在子类写上  extends Pet
 * 3.继承修饰符后面重点讲
 */
public class Pet {
    public String name;
    public int health;//健康值
    public int love;//与主人亲密度

    private   int ccc;   //能访问父类private修饰成员
    int ddd;
    public void run(){
        System.out.println("跑呀跑");
    }
}
