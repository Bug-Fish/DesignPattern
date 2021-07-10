package adapter;

/**
 * @author jiaoyuzhang
 * @date 2021/7/10 15:51
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("嘎嘎叫");
    }

    @Override
    public void fly() {
        System.out.println("飞得又远又高");
    }
}
