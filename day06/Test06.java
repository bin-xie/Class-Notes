package Notes.day06;

public class Test06 {
    public static void main(String[] args) {
        int num=3;
        switch (num){
            default:
                System.out.println();
                break;
            case 1:
                System.out.println("星期一");
            case 2:
                System.out.println("星期二");
            case 3:
                System.out.println("星期三");
            case 4:
                System.out.println("星期四");
            case 5:
                System.out.println("星期五");
                break;    //break 就是跳出当前 switch选择结构
            case 6:
                System.out.println("星期六");

        }
    }
}
