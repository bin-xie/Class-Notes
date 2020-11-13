package Notes.day15.Pets;



class Dog extends Pets{
    @Override
    public void eat(){
        //狗狗吃完后健康值增加 5    this.getHealth()获取原来的值再加5
        this.setHealth(this.getHealth()+5);
        System.out.println("狗狗吃饱了，健康值加5");
    }
}

class Penguin extends Pets{
    @Override
    public void eat(){
        super.setHealth(super.getHealth()+10);
        System.out.println("企鹅吃饱了，健康值加10");

        //如果在测试类传参数的时候，直接在（）中new的对象，想打印输入信息只能这样
        this.print();
    }
}