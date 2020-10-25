package Notes.day05;

/**
 * 条件:
 * 如果你的存款  大于100 W   就可以买一辆  BMW
 * 如果你的存款  大于50 W    就可以买一辆  凯迪拉克
 * 如果你的存款  大于30 W    就可以买一辆  大众
 * 如果你的存款  大于10 W    就可以买一辆  比亚迪
 * 如果你的存款  大于5 W     就可以买一辆  自行车
 */
public class Test06 {
    public static void main(String[] args) {
        int money=51;
        if(money>100){
            System.out.println("可以买一辆  BMW");
        }else if(money>50){
            System.out.println("可以买一辆  凯迪拉克");
        }else if(money>30){
            System.out.println("可以买一辆  大众");
        }else if(money>10){
            System.out.println("可以买一辆  比亚迪");
        }else{
            System.out.println("可以买一辆  自行车");
        }
    }
}
