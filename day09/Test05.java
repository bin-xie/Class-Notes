package Notes.day09;

/**
 * 创建数组的3种方式
 * int类型     下标默认为 0
 * double类型  下标默认为 0
 * 字符串       下标默认为 null
 */
public class Test05 {
    public static void main(String[] args) {
        //创建数组的第1种方式
        /*int[] nums={1,2,3,4,5};    //定义数组

        // 循环遍历
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }*/

        //创建数组的第2种方式
        int nums2[]=new int[5];   //容量为5
        //nums2[5]=5;   //ArrayIndexOutOfBoundsException
        System.out.println(nums2[0]);     //int类型    下标默认为 0
        System.out.println(nums2[1]);

        nums2[4]=5;    //给下标4 赋值为5
        System.out.println(nums2[4]);   //值为5

        //创建数组的第3种方式
        int[] nums3=new int[]{1,2,3,4,5};
        //int[] nums3=new int[5]{1,2,3,4,5};   会报错，笔试题有可能会考，是坑
        System.out.println("第三种创建方式循环");
        for (int i=0;i<nums3.length;i++) {
            System.out.println(nums3[i]);
        }
    }
}
