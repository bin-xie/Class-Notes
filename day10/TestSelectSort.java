package Notes.day10;

public class TestSelectSort {
    /**
     * 选择排序
     */
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 5, 2, 1};

        //外层   从第一个(i)值开始    减一代表最多循环4次
        for (int i=0;i<nums.length-1;i++){
            boolean flag = true;             //防止都是排好的，排好了就为真
            //内层  j=i+1表示永远是与后面的比较，前面的已经比了  j<小于空间容量
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){       //第一个(i)值与第二个(j)比较  在与后面的值比较
                    int temp=nums[j];      //值互换
                    nums[j]=nums[i];
                    nums[i]=temp;
                    flag=false;           //程序进来表示不是排好的，所以要false掉
                }
            }
            if (flag){                  //是真就直接跳出循环
                break;
            }
        }
        for (int i=0;i<nums.length;i++) {
            System.out.print(nums[i] + "\t");
        }
    }
}
