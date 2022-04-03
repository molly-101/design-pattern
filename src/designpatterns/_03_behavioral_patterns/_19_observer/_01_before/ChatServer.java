package designpatterns._03_behavioral_patterns._19_observer._01_before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    Map<String, List<String>> map = new HashMap<>();

    public void add(String subject, String message) {
        if (map.containsKey(subject)) {
            List<String> users = map.get(subject);
            users.add(message);
        } else {
            List<String> messageList = new ArrayList<>();
            messageList.add(message);
            map.put(subject, messageList);
        }
    }

    public List<String> getMessage(String subject) {
        return map.get(subject);
    }
}
