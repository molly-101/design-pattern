package designpatterns._03_behavioral_patterns._21_strategy._02_after;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight();
        blueLightRedLight.blueLight(new Normal());
        blueLightRedLight.redLight(new Fast());
        blueLightRedLight.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("Blue Light");
            }

            @Override
            public void redLight() {
                System.out.println("Red Light");
            }
        });

        blueLightRedLight.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("상속된 값이 들어갑니다.");
            }

            @Override
            public void redLight() {
                System.out.println("상속된 값이 들어간 redLight");
            }
        });
    }
}
