package designpatterns._02_structural_patterns._13_decorator;

public class Logger2Decorator implements Component{

    private Component component;

    public Logger2Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("로그 2 를 찍었습니다");
        component.operation();
    }
}
