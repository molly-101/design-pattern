package designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

import designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._01_before.Request;

public class LoggingRequestHandler extends RequestHandler {
    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("request에 대한 로그를 남깁니다!!!");
        super.handle(request);
    }
}
