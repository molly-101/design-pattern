package designpatterns._03_behavioral_patterns._18_memento._02_after;

public class LessonService {

    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public void completeLesson(Lesson lesson) {
        LessonMemento lessonMemento = lesson.createLessonMemento();
        lesson.setStatus(true);
        try {
            // save lesson
            lessonRepository.save(lesson);
            // business logic ....
            // Exception occur!!!!
            // business logic -> point 5000
        } catch (Exception e) {
            lesson.rollback(lessonMemento);
            lessonRepository.save(lesson);
        }
    }
}
