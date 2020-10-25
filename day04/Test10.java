package Notes.day04;

public class Test10 {
    public static void main(String[] args) {
        /* int zhangSan =80;
        //判断
        if(zhangSan>90) {
            System.out.println("奖励笔记本电脑一台");
        }
        System.out.println("程序结束");*/

        if(true){
                       //这里面只有真才会输出
            System.out.println("执行了1");
        }

        if(false){
                       //假不会输出
            System.out.println("不执行");
        }

        if(!true){          // !  只要见到它就是取反
            //这里面只有真才会进来
            System.out.println("执行了2");
        }
    }
}
