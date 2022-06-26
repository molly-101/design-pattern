package designpatterns._03_behavioral_patterns._22_template_method._02_after_callback;

public class Client {

    public static void main(String[] args) {
        Template template = new Template();
        template.execute(5, new Call() {
            @Override
            public int method(int result, int number) {
                return result + number;
            }
        });
        System.out.println();

        template.execute(5, (result, number) -> result * number);
    }
}
