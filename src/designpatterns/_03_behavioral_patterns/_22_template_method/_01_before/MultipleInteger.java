package designpatterns._03_behavioral_patterns._22_template_method._01_before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleInteger {

    /**
     * BufferedReader 에 들어오는 5개의 인자를 result 에 모두 곱하고 반환한다.
     */
    public void execute(int result) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                result *=Integer.parseInt(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("result : " + result);
    }
}
