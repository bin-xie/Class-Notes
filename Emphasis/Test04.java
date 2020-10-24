package Notes.Emphasis;

public class Test04 {
    public static void main(String[] args) {
        int num1=30;
        int num2=100;

        boolean isBig=false;
        isBig=num1<num2;
        System.out.println(isBig);   //值为true ，真正开发不会有这种写法


        if (num1<num2){        //30<100 得到的结果为true
        System.out.println("会输出");
        }
        if (num1>num2){
        System.out.println("不会输出");  //不会输出 得到的结果为false
        }
        if (num1==num2){        // 得到的结果为false
            System.out.println("不会输出");
        }
        if (num1!=num2){   // 得到的结果为true 只要家了！就是取反的意思 如果是false结果为true  如果是true结果为false
            System.out.println("会输出");
        }

        if (!false){
            System.out.println("！就是取反的意思  所以输出了");
        }
        if (!true){
            System.out.println("！就是取反的意思  所以不会输出");
        }
    }
}
