package designpatterns._01_creational_patterns._01_singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    // 1. 모든 getInstance() 접근에 synchronized 를 거는 경우
//    private static Settings instance;
//
//    private Settings() {}
//
//    public static Settings getInstance() {
//        if (instance == null) {
//            instance = new Settings();
//        }
//        return instance;
//    }

    // 2. Application 이 올라갈때 미리 인스턴스를 생성해서 메모리에 올리는 경우
//    private static final Settings INSTANCE = new Settings();
//
//    private Settings() {}
//
//    public static Settings getInstance() {
//        return INSTANCE;
//    }

    // 3. synchronized 를 내부에 배치 : double checked locking
//    private static volatile Settings instance;
//
//    private Settings() {}
//
//    public static Settings getInstance() {
//        if (instance == null) {
//            synchronized (Settings.class) {
//                if (instance == null) {
//                    return new Settings();
//                }
//            }
//        }
//        return instance;
//    }

    // 4. static inner 클래스를 사용하기
    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
