package Notes.day07;

public class Test05 {
    /**
     * debug模式：  快捷键F7单步执行   F9到下一个断点
     * 必需把以前写的代码全部通过debug调试一次
     * debug调试代码，非常非常重要
     */
    public static void main(String[] args) {
      
        System.out.println("程序执行1");
        System.out.println("程序执行2");
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("程序执行1");
        System.out.println("程序执行2");
    }

}
