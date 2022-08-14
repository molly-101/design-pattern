package designpatterns._03_behavioral_patterns._18_memento._02_after;

public final class LessonMemento {

    private final String id;

    private final String title;

    private final boolean status;

    public LessonMemento(String id, String title, boolean status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isStatus() {
        return status;
    }
}
