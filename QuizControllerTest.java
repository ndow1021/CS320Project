import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuizControllerTest {

    @Test
    void getScore() {
        QuizController quizController11 = new QuizController();
        quizController11.setScore(1);
        assertEquals(quizController11.getScore(), 1);
        quizController11.setScore(3);
        assertEquals(quizController11.getScore(), 3);
        quizController11.setScore(10);
        assertEquals(quizController11.getScore(), 10);
    }

    @Test
    void setScore() {
        QuizController quizController22 = new QuizController();
        quizController22.setScore(1);
        assertEquals(quizController22.getScore(), 1);
        quizController22.setScore(3);
        assertEquals(quizController22.getScore(), 3);
        quizController22.setScore(10);
        assertEquals(quizController22.getScore(), 10);
    }

    @Test
    void addToScore() {
        QuizController quizController33 = new QuizController();
        quizController33.setScore(1);
        quizController33.addToScore(1);
        assertEquals(quizController33.getScore(), 2);
        quizController33.setScore(3);
        quizController33.addToScore(14);
        assertEquals(quizController33.getScore(), 17);
        quizController33.setScore(10);
        quizController33.addToScore(3);
        assertEquals(quizController33.getScore(), 13);
    }
}