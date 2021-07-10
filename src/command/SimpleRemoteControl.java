package command;

/**
 * @author jiaoyuzhang
 * @date 2021/7/10 15:04
 */
public class SimpleRemoteControl {
    Command slot;
    public void setCommand(Command command) {
        slot = command;
    }
    public void pressButton() {
        slot.execute();
    }
}
