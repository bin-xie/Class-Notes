package Notes.day10;
/**
 * 冒泡排序
 * 	   1.原理：比较相邻的两个元素，将最大的值交换到最右边
 * 	   2.思路：依次比较相邻的两个元素，将小的放到左边将大的放 到右边
 * 	作业：
 * 	选择排序  我会讲理论  作业自己完成 ，完成不了没关系
 * 		1.原理 :从序列中找出最大的那个元素，然后放 到末尾
 * 		2.忽略 曾找到最大元素
 * 排序有：
 * 冒泡排序 选择排序 插入排序 希尔排序 归并排序 快速排序 堆排序 计数排序 桶排序 基数排序
 * 	Arrays.sort(nums);  是快速排序和优化的归并排序
 */
public class Test04 {
    public static void main(String[] args) {

        /*int nums[] = {5,2};
        int temp=nums[0];     //把5拿出来了
        nums[0]=nums[1];
        nums[1]=temp;
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }*/

        //第一次下标是  0与1  第二次呢
       /* int nums[] = {2,5,1,9,6};
        for (int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){      //2>5    5>1
                int temp= nums[i-1];    //  不能使用0
                nums[i-1]=nums[i];
                nums[i]=temp;
            }
        }*/

       /*int nums[] = {2,5,1,9,6};
       for (int end=nums.length-1;end>0;end--){
           for (int i=1;i<end+1;i++){
               if(nums[i-1]>nums[i]){          //2>5    5>1
                   int temp= nums[i-1];        //  不能使用0
                   nums[i-1]=nums[i];
                   nums[i]=temp;
               }
           }
       }*/

        int nums[] = {1,2,5,6,9};   //假设都是排好的
        //int nums[] = {2,5,1,9,6};
        for (int end=nums.length-1;end>0;end--){
            //假设都是排好的
            boolean flag = true;
            for (int i=1;i<end+1;i++){
                if(nums[i-1]>nums[i]){          //2>5    5>1
                    int temp= nums[i-1];        //  不能使用0
                    nums[i-1]=nums[i];
                    nums[i]=temp;
                    flag=false;      //只要有进来就设置为false
                }
            }
            //System.out.println("看我循环几次");
            if (flag){
                break;
            }
        }
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }

    }
}
