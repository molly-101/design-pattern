package designpatterns._03_behavioral_patterns._22_template_method._02_after_callback;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Template {

    public void execute(int result, Call call) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                // Executed Method is Here~~!!!
                result = call.method(result, Integer.parseInt(br.readLine()));
                // Method End
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("result : " + result);
    }
}
