package Notes.day09;

import java.util.Arrays;    //导的包
import java.util.Scanner;
//如果想用Arrays又想用Scanner，两个一起用就写java.util.Scanner input=new java.util.Scanner(System.in);
/**
 * 数组扩容
 */
public class Test08 {
    public static void main(String[] args) {
        //原数组
        /*int[] oldArray=new int[]{11,22,33,44,55};

        //扩容步骤1：创建比原数组更大的新数组
        int[] newArray = new int[oldArray.length * 2];


        //扩容步骤2：将原数组的元素，一次复制到新数组中
        //第一种方法
        *//*for (int i=0;i<oldArray.length;i++){
            newArray[i]=oldArray[i];
        } *//*

        //第二种方法
        //System.arraycopy(oldArray,0,newArray,0,oldArray.length);



        //遍历访问
        for (int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+"\t");
        }
        System.out.println();*/


//--------------------------------------------------------------------
        //第三种方法
        //原数组
        int[] oldArray=new int[]{11,22,33,44,55};

        //扩容步骤1：创建比原数组更大的新数组
        int[] newArray= Arrays.copyOf(oldArray,oldArray.length*2);
        //不想导包就写java.util.Arrays.copyOf

        //遍历访问
        for (int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+"\t");
        }
        System.out.println();

    }
}
