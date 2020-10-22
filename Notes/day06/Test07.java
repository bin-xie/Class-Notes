package chaodaima.day06;

public class Test07 {
    /**
     * 1.所有的switch ()    if else 都可以解决
     * 2.if else 不是相等的判断 switch解决不了
     */
    public static void main(String[] args) {
        /*if (){
            if (){
                if (){

                }
            }
        }*/
        /*int num=1;
        switch (num){
            case 1:
                int num2=3;
                //只能写在这里
                switch (num2) {
                    case 1:
                        *//*switch (){

                        }*//*
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }*/

        int num=1;
        //switch 可以嵌套 if else
        //if else 可以嵌套 switch
        switch (num){
            case 1:
                System.out.println("星期一");
                if (num>10){
                    System.out.println("大于10做什么");
                    /*switch (){

                    }*/
                }else {
                    System.out.println("不大于10");
                }
                break;
            case 2:
                break;
            default:
        }
    }
}
