package designpatterns._03_behavioral_patterns._14_command._01_before;

public class Game {

    private boolean isOn;

    public void start() {
        System.out.println("게임을 시작함니다");
        this.isOn = true;
    }

    public void end() {
        System.out.println("게임을 끝냅니다");
        this.isOn = false;
    }
}
