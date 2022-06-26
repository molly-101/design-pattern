package designpatterns._03_behavioral_patterns._22_template_method._02_after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractTemplate {

    public void execute(int result) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                // Executed Method is Here~~!!!
                result = method(result, Integer.parseInt(br.readLine()));
                // Method End
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("result : " + result);
    }

    // 상속받는 객체가 구현하게끔 한다.
    public abstract int method(int result, int input);
}
