package Notes.day10;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Test03 {
    public static void main(String[] args) {
        //定义数组
        int nums[] = {2,5,1,9,6};
        System.out.println("没有排序之前");
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }

        //排序
        Arrays.sort(nums);   //Arrays.sort是快速排序和优化的归并排序
        System.out.println("\n排序之后的");
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    }
}
