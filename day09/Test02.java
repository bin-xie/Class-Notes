package Notes.day09;

/**
 * 学习数组
 * 下标是从0开始的
 */
public class Test02 {
    public static void main(String[] args) {
        //int num=10;      //以前定义int数组变量，只能存一个数字

        //定义一个int数组变量，可以存多个数字
        //int nums[]={1,2,3,4,5};
        int[] nums={1,2,3,4,5};        //也可以这样
        System.out.println(nums);      // [I@723279cf
        System.out.println(nums[2]);   //获取下标为2的值  运行值为3
        System.out.println(nums[4]);   //获取为5的值

        //Array Index OutOfBounds Exception 数组下标越界异常
        //System.out.println(nums[5]);

        //num=100;         //以前的修改
        //现在想把1  修改为10
        nums[0]=10;
        System.out.println(nums[0]);
    }
}
