package designpatterns._03_behavioral_patterns._21_strategy._02_after;

public class Fast implements Speed {

    @Override
    public void blueLight() {
        System.out.println("무공꼬치");
    }

    @Override
    public void redLight() {
        System.out.println("피씀다");
    }
}
