package Notes.day10;

public class Test001 {
    public static void main(String[] args) {
        //1.先声明，再分配空间
        int[] nums;
        nums=new int[5];

        //2.声明并分配空间
        int[] array=new int[4];

        //3.声明并赋值（繁琐）
        int[] numbers=new int[]{11,22,33,44,55,66};
        System.out.println(numbers.length);
        /*int[] numbers;          //也可以写成这样
        numbers=new int[]{11,22,33,44,55,66};
        System.out.println(numbers.length);*/

        //4.声明并赋值（简单）
        int[] values={55,66,77,88,};
        System.out.println(values.length);
    }

}
