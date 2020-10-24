package Notes.Emphasis;

public class Test03 {
    public static void main(String[] args) {
        boolean isBig=false;
        isBig=30<100;
        System.out.println(isBig);   //值为ture ，真正开发不会有这种写法
        /*if (true){
            System.out.println("会输出");
        }
        if (false){
            System.out.println("不会输出");
        }*/

        if (30<100){        //30<100 得到的结果为ture
            System.out.println("会输出");
        }
        if (30>100){        //30>100 得到的结果为false
            System.out.println("不会输出");
        }

    }
}
