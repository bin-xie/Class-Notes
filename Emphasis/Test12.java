package Notes.Emphasis;

/**
 * 数组
 */
public class Test12 {
    public static void main(String[] args) {
        //创建数组  容量为5  int默认值系统设置为了0  下标从0开始
        int  nums[] = new int[5];
        nums[2]=20;
        nums[0]=100;
        // nums[5]=50;//java.lang.ArrayIndexOutOfBoundsException: 5
        System.out.println(nums[0]);  //下标:0    int值：100
        System.out.println(nums[1]);  //    1           0
        System.out.println(nums[2]);  //    2           20
        System.out.println(nums[3]);  //    3           0
        System.out.println(nums[4]);  //    4           0

        //System.out.println(nums[5]);//请问有下标5的吗 java.lang.ArrayIndexOutOfBoundsException: 5
                                      //下标只有0.1.2.3.4  没有5
    }
}
