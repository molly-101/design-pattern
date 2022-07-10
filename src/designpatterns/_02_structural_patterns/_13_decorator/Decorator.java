package designpatterns._02_structural_patterns._13_decorator;

public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
