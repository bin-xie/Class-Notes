package chaodaima.day08;

public class Test07 {
    public static void main(String[] args) {
       // switch ()      使用break; 跳出switch选择结构
       // break 跳出死循环 只是跳出本次循环
        /*while (true){          // 死循环
            System.out.println("是不是跳出死循环");
            break;             //只要见到 break; 就跳出死循环
            //return;            //见到return;就会跳出整个main循环，后面的代码都不执行了
            }*/

            for (;;){
                System.out.println("是不是跳出死循环");
                break;           //只要见到 break; 就跳出死循环
                //return;            //见到return;同样跳出循环
            }
               System.out.println("");     //不能写了，因为上面写了return 跳出了整个方法 后面代码都不执行了
      }
}
