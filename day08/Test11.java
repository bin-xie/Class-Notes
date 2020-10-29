package Notes.day08;

public class Test11 {
    /**
     * 打印等腰三角形
     */
    public static void main(String[] args) {
       /*
         $$$$$*
         $$$$***
         $$$*****
         $$*******
         $*********
         ***********
         */
        int rows=6;
        for (int i=1;i<=rows;i++){
            for (int j=rows-1;j>=i;j--){
                System.out.print(" ");         //把$改成空格，里面是空格
            }
            for (int k=1;k<=i*2-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
