package Notes.day10;

/**
 * 复习数组
 *    数组的三种方式
 */
public class Test01 {
    public static void main(String[] args) {
        //第一种
        int nums[]={1,2,3,4,5};
        //第二种
        int nums2[]=new int[10];    //int下标初始化为0
        //第三种
        int nums3[]=new int[]{1,2,3,4,5};

        //第一种的
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}
