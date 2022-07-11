package designpatterns._02_structural_patterns._09_decorator;

public class LoggerDecorator extends Decorator implements Component{

    public LoggerDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("로그를 찍었습니다");
        component.operation();
    }
}
