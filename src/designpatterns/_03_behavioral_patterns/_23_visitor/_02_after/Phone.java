package designpatterns._03_behavioral_patterns._23_visitor._02_after;

public class Phone implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("Print circle to Phone");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Print rectangle to Phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Print triangle to Phone");
    }
}
