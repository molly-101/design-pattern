package designpatterns._03_behavioral_patterns._14_command._01_before;

public class MyApp {

    private Light light;

    public MyApp(Light light) {
        this.light = light;
    }

    public void press() {
        light.on();
    }

}
