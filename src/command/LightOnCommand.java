package command;

/**
 * @author jiaoyuzhang
 * @date 2021/7/10 15:01
 */
public class LightOnCommand implements Command {
    public Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
