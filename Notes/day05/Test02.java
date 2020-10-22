package chaodaima.day05;

public class Test02 {
    /*
    * 复杂选择结构
    * 张三的Java成绩大于98 并且MySQL成绩大于80 老师奖励电脑一台
    * 或者Java成绩等于100 且MySQL成绩大于60 老师同样奖励电脑一台
    * */
    public static void main(String[] args) {
        int javaSe=100;
        int mysql=61;
        /*//张三的Java成绩大于98并且MySQL成绩大于80老师奖励电脑一台
        if (javaSe>98 && mysql>80){      //&&键盘上的7
            System.out.println("老师奖励电脑一台");
        }
        //Java成绩等于100 且MySQL成绩大于60 老师同样奖励电脑一台
        if (javaSe==100 && mysql>60){
            System.out.println("老师同样奖励电脑一台");
        }*/

        /*
         * 复杂选择结构
         * 张三的Java成绩大于98 并且MySQL成绩大于80 老师奖励电脑一台
         * 或者Java成绩等于100 且MySQL成绩大于60 老师同样奖励电脑一台
         * */
        //(javaSe>98 && mysql>80) || (javaSe==100 && mysql>60)
        if ((javaSe>98 && mysql>80) || (javaSe==100 && mysql>60)){
            System.out.println("老师奖励电脑一台");
        }

    }   //&&  键盘上的shift加7    ||  shift加反斜杠
}
