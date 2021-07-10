package command;

/**
 * @author jiaoyuzhang
 * @date 2021/7/10 15:25
 */
public class DoorOffCommand implements Command {

    public Door door;
    public DoorOffCommand(Door door) {
        this.door = door;
    }
    @Override
    public void execute() {
        door.off();
    }
}
