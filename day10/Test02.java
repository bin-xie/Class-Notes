package Notes.day10;

public class Test02 {
    /**
     * 求最大值或最小值
     */
    public static void main(String[] args) {
        int nums[]={1,3,69,56,89,6};
        //假如 下标0最大
        int maxNum=nums[0];
        int minNum=nums[0];
        //循环遍历
        for(int i =1;i<nums.length;i++){
            // System.out.println(nums[i]);/
            //判断
            //第一次 最大值变为3   第二次变为69   56  89  6
            if(nums[i]>maxNum){ //3 >1   69>3  56>69不成立  89>69  6>89不成立
                maxNum=nums[i];
            }
            if(nums[i]<minNum){
                minNum=nums[i];
            }
        }
        System.out.println("最大值为"+maxNum);
        System.out.println("最小值为"+minNum);
    }
}
