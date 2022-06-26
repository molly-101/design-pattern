package designpatterns._03_behavioral_patterns._22_template_method._02_after;

public class SumInteger extends AbstractTemplate{

    @Override
    public int method(int result, int input) {
        return result + input;
    }

}
