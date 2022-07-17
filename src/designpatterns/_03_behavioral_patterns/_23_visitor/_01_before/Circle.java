package designpatterns._03_behavioral_patterns._23_visitor._01_before;

public class Circle implements Shape{
    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("circle is printed on Phone");
        } else if (device instanceof Watch) {
            System.out.println("Circle is printed on Watch");
        }
    }
}
