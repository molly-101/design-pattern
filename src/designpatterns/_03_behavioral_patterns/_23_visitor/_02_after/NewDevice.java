package designpatterns._03_behavioral_patterns._23_visitor._02_after;

public class NewDevice implements Device{
    @Override
    public void print(Circle circle) {
        System.out.println("Circle is printed on newDevice");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Rectangle is printed on newDevice");

    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Triangle is printed on newDevice");

    }
}
