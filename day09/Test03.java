package Notes.day09;

/**
 * 学习数组
 * String 类型
 * 下标是从0开始的
 */
public class Test03 {
    public static void main(String[] args) {
        /*String str="aa";       //以前写法
        char cc[]={'a','b'};*/   //以前写法


                //下标： 1   2   3   4   5
        String strs[]={"a","b","c","d","e"};   //定义一个数据类型
        System.out.println(strs[2]);   //获取下标为2的值   运行结果为c

        //数组的容量是固定的
        //strs[5]="f";   //下标没有五，数组只有5位，下标就是01234
                       //会报ArrayIndexOutOfBoundsException

        //查询数组容量
        System.out.println("数组的长度为："+strs.length);
        System.out.println("==================================");
        for (int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }
}
