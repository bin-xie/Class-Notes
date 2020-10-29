package Notes.day05;

public class Test08 {
    /**
     * if 嵌套结构
     */
    public static void main(String[] args) {
        /**
         * 如果 10秒 以下进入决赛
         *   有男子组
         *   有女子组
         */
        int num=9;
        if(num<10){
            System.out.println("进入决赛 ");
            String sex="女 ";
            //有男子组  有女子组
            if(sex.equals("男")){
                System.out.println("进入男子组");
            }else{
                System.out.println("进入女子组");
            }
        }else {
            System.out.println("下次再努力一点点,退出比赛");
        }
    }
}
