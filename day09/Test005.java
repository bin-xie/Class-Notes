package Notes.day09;

/**
 * 数组默认值
 * int  double  boolean  String  char
 */
public class Test005 {
    public static void main(String[] args) {
        int[] inValues=new int[4];
        System.out.println(inValues[0]);

        double[] doubleValues=new double[4];
        System.out.println(doubleValues[0]);

        boolean[] boolValues=new boolean[4];
        System.out.println(boolValues[0]);

        String[] StringValues=new String[4];
        System.out.println(StringValues[0]);

        char[] charValues=new char[4];
        System.out.println(charValues[0]); //展示的是四个零
    }

}
