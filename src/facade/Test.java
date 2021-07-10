package facade;

/**
 * @author jiaoyuzhang
 * @date 2021/7/10 16:22
 */
public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        Screen screen = new Screen();
        HomeTheaterFacade facade = new HomeTheaterFacade(light, screen);
        facade.watchMovie();
        facade.endMovie();
    }
}
