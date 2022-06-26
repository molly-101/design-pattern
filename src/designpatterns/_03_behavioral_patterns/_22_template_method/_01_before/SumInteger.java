package designpatterns._03_behavioral_patterns._22_template_method._01_before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumInteger {

    /**
     * BufferedReader 에 들어오는 5 개의 인자를 모두 result 에 더한 후 출력한다
     */
    public void execute(int result) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                result +=Integer.parseInt(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("result : " + result);
    }
}
