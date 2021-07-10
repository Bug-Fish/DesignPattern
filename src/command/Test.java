package command;

/**
 * @author jiaoyuzhang
 * @date 2021/7/10 15:07
 */
public class Test {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Door door = new Door();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        DoorOffCommand doorOffCommand = new DoorOffCommand(door);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(doorOffCommand);
        remoteControl.pressButton();
    }
}
