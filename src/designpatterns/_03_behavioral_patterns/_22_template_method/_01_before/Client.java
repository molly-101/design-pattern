package designpatterns._03_behavioral_patterns._22_template_method._01_before;

public class Client {

    public static void main(String[] args) {
        MultipleInteger multipleInteger = new MultipleInteger();
        multipleInteger.execute(5);

        SumInteger sumInteger = new SumInteger();
        sumInteger.execute(5);
    }
}
