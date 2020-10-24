package Notes.Emphasis;

/**
 * 数组创建三种方式
 */
public class Test14 {
    public static void main(String[] args) {
        //数组创建三种方式
        //这是第一种
        int[]  nums = new int[5];

        //创建第二种  //容量也是5
        int nums2[]={1,2,3,4,5};
        //nums2[5]=50;//java.lang.ArrayIndexOutOfBoundsException
        for(int i=0;i<nums2.length;i++){
            System.out.println(nums2[i]);
        }

        //第三种 开发很少有人写
        int[] nums3=new int[]{1,2,3,4,5};

        String str[]  ={"a","b","c","c"};

    }
}
