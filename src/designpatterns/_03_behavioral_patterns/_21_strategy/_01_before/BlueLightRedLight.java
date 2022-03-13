package designpatterns._03_behavioral_patterns._21_strategy._01_before;

public class BlueLightRedLight {

    private int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    public void blueLight() {
        if (speed == 1) {
            System.out.println("무궁화 꽃이 ");
        } else if (speed == 2) {
            System.out.println("무궁화 꽃");
        } else {
            System.out.println("무광꽃");
        }
    }

    public void redLight() {
        if (speed == 1) {
            System.out.println("피었습니다.");
        } else if (speed == 2) {
            System.out.println("피어씀다");
        } else {
            System.out.println("피씀다.");
        }
    }
}
