package Notes.Emphasis;

/**  ctrl+/ 单行注释
 *   ctrl+shift+/ 多行注释  /+*+Enter
 *   /+**+Enter 文档注释
 */

public class Test01 {
    // 快捷键两种方式  main回车 与 psvm回车
    //public static void main(String[] args) {

    //代码规范非常重要
    public static void main(String[] args) { //再写代码的时候，把光标定义在这里回车 代码会自动规范
        //sout回车
        System.out.println(1111);  //向控制台打印输出数字1111
        //如果需要输出 中文必须在（""）中加上""
        System.out.println("我输出的是中文");
        //所有软件中的换行通用都是Enter 换行后如果代码不规范的情况可以按Tab键

        //if（4>6）{} 然后才会车 这个代码就会不规范了 这个{}必须成对
        if (4>6){

        }
        /*if (4<6){  //这样写就是规范的，一般情况不需要按Tab键
        }*/
        if (4<6){

        }

    }
}
