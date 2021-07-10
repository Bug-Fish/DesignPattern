package facade;

/**
 * @author jiaoyuzhang
 * @date 2021/7/10 16:17
 */
public class HomeTheaterFacade {
    Light light;
    Screen screen;
    public HomeTheaterFacade(Light light, Screen screen) {
        this.light = light;
        this.screen = screen;
    }
    public void watchMovie() {
        light.open();
        screen.open();
    }
    public void endMovie() {
        light.close();
        screen.close();
    }
}
