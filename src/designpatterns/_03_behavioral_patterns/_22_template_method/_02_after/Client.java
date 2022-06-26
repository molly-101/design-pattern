package designpatterns._03_behavioral_patterns._22_template_method._02_after;

public class Client {

    public static void main(String[] args) {
        SumInteger sumInteger = new SumInteger();
        sumInteger.execute(5);

        MultipleInteger multipleInteger = new MultipleInteger();
        multipleInteger.execute(5);
    }
}
