package Notes.Emphasis;

public class Test13 {
    public static void main(String[] args) {
        int  nums[] = new int[5];
        nums[2]=20;
        nums[0]=100;
        System.out.println("数组的容量为"+nums.length);
        /*for(int i=0;i<5;i++){
            System.out.println(i);
        }*/

        for(int i=0;i<nums.length;i++){
            //System.out.println(i);
            System.out.println(nums[i]);
        }
    }
}
