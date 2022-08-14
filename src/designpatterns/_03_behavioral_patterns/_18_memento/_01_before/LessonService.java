package designpatterns._03_behavioral_patterns._18_memento._01_before;

public class LessonService {

    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public void completeMission(Lesson lesson) {
        lesson.setStatus(true);
        try {
            // save lesson
            lessonRepository.save(lesson);
            // business logic ....
            // Exception occur!!!!
            // business logic -> point 5000
        } catch (Exception e) {
            lesson.setStatus(false); // bad case
            lessonRepository.save(lesson);
        }
    }
}
