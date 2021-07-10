package adapter;

/**
 * @author jiaoyuzhang
 * @date 2021/7/10 15:59
 */
public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        wildTurkey.fly();
        wildTurkey.gobble();

        duckAction(mallardDuck);
        duckAction(turkeyAdapter);

    }

    private static void duckAction(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
