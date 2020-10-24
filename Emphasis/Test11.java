package Notes.Emphasis;

/**
 * debug  合格程序员都是会使用debug的
 * 红色实心圆圈 代表一个断点
 * 使用快捷键  F9 到一个断点  这个一定使用快捷键  其它不要老想着用快捷键
 *           F7 可以跳到一行代码
 *
 * 如果不小心点进去了源码  F9就可以出去 或者停止debug
 *
 * 不是debug运行模式就算有断点也没关系
 *
 * 笔记本使用  F9 F7 需要加Fn
 */
public class Test11 {
    public static void main(String[] args) {


        System.out.println("调试程序开始123");
        System.out.println("调试程序开始222");

        for(int i=1;i<=100;i++){
            System.out.println(i);
        }

        System.out.println("调试程序结束123");
        System.out.println("调试程序结束222");

    }
}
