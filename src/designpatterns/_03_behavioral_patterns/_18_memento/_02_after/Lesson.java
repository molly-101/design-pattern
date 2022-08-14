package designpatterns._03_behavioral_patterns._18_memento._02_after;

public class Lesson {

    private String id;

    private String title;

    private boolean status;

    public Lesson(String id, String title, boolean status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public LessonMemento createLessonMemento() {
        return new LessonMemento(this.id, this.title, this.status);
    }

    public void rollback(LessonMemento lessonMemento) {
        this.id = lessonMemento.getId();
        this.title = lessonMemento.getTitle();
        this.status = lessonMemento.isStatus();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
