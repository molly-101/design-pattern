package designpatterns._02_structural_patterns._09_decorator;

public class Clien {

    public static void main(String[] args) {
        Component logger2Decorator = new Logger2Decorator(new LoggerDecorator(new RealComponent()));

        if (status == 1) {
            new Logger2Decorator(new RealComponent());
        } else {
            Component logger2Decorator = new Logger2Decorator(new LoggerDecorator(new RealComponent()));
        }

        logger2Decorator.operation();
    }
}
