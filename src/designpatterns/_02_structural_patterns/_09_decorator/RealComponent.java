package designpatterns._02_structural_patterns._09_decorator;

public class RealComponent implements Component{

    @Override
    public void operation() {
        System.out.println("업무 실행");
    }
}
