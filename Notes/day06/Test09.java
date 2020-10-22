package chaodaima.day06;

public class Test09 {
    /**
     * 作业一定是先抄写完我的代码之后(抄3遍) 再去完成我布置的所有作业
     * */
    public static void main(String[] args) {
        //定义登陆 退出的就量  1 登陆  2退出
        int loginId=2;    //新词请各位同学必需自己输入
        switch (loginId){
            case 1:
                System.out.println("登陆成功");
                int num=1;
                if (num==1){
                    System.out.println("客户信息管理");
                }else if (num==2){
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("登陆失败");
            case 3:
                System.out.println("输入有误");
                break;
        }
    }
}
