package designpatterns._03_behavioral_patterns._14_command._03_java;

import designpatterns._03_behavioral_patterns._14_command._01_before.Game;
import designpatterns._03_behavioral_patterns._14_command._01_before.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {

    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        // JAVA 8 이전의 구현
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                light.on();
            }
        });
        executorService.submit(light::off);
        // Lambda 방식으로 구현 JAVA 9 이후 
        executorService.submit(() -> game.start() );
        executorService.submit(game::end);
        executorService.shutdown();
    }
}
