package Notes.day05;

public class Test04 {
    public static void main(String[] args) {
        /**
         * 大于80以上 良好   60至80 中等(包括60)   小于60 差
         */

        int javaSe=100;
        if(javaSe>80){
            System.out.println("良好");
        }else if(javaSe>=60){
            System.out.println("中等");
        }else{              // if(javaSe<60)
            System.out.println("差");
        }
        System.out.println("后面都会执行的");
    }
}
