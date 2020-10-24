package Notes.day09;

public class Test07 {
    public static void main(String[] args) {
        int nums1[] = new int[5];
        System.out.println(nums1);
        System.out.println(nums1[0]);//0
        System.out.println(nums1[1]);//0
        nums1[0]=10;
        nums1[1]=20;
        System.out.println(nums1[0]);//10
        System.out.println(nums1[1]);//20

        int nums2[]=nums1; //赋值了，与上面有关系了

        System.out.println(nums2[0]);//10
        System.out.println(nums2[1]);//20

        nums2[0]=100;//修改 nums2数组中的 下标为0的值
        System.out.println(nums1[0]);
    }
}
