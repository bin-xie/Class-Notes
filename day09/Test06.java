package Notes.day09;

/**
 * 1.栈内存空间：  存放方法中的去局部变量
 * 2.堆 内 存 ：  只要new出来的就存在堆内存里c'x'x
 *               堆内存里面的东西都有一个地址值
 *              堆内存都有默认值
 *                   int 默认值为 0
 *                   String 默认值为 null
 *                   boolean 默认值为 false
 * 3.方 法 区 ：  存储class相关的信息包含方法的信息
 */
public class Test06 {
    public static void main(String[] args) {
        //int num=10;//这就是局部变量
        int[] nums = new int[5];
        System.out.println(nums);    //地址值 [I@723279cf
        System.out.println(nums[0]);//0
        System.out.println(nums[1]);//0
        nums[0]=10;
        nums[1]=20;
        System.out.println(nums[0]);//10
        System.out.println(nums[1]);//20

        System.out.println("走完了");

        //与上面的没有关系

        int nums2[] = new int[5];
        System.out.println(nums2[0]);//0
        System.out.println(nums2[1]);//0
        nums2[0]=100;
        nums2[1]=200;
        System.out.println(nums2[0]);//10
        System.out.println(nums2[1]);//20

    }
    //这是普通方法
    public void addUser(){
        System.out.println(111);
    }
}
