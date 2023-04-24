import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {

    @Test
    void getScore() {
        Quiz quiz1 = new Quiz();
        quiz1.setScore(1);
        assertEquals(quiz1.getScore(), 1);
        quiz1.setScore(3);
        assertEquals(quiz1.getScore(), 3);
        quiz1.setScore(10);
        assertEquals(quiz1.getScore(), 10);
    }

    @Test
    void setScore() {
        Quiz quiz2 = new Quiz();
        quiz2.setScore(1);
        assertEquals(quiz2.getScore(), 1);
        quiz2.setScore(3);
        assertEquals(quiz2.getScore(), 3);
        quiz2.setScore(10);
        assertEquals(quiz2.getScore(), 10);
    }

    @Test
    void updateScore() {
        Quiz quiz3 = new Quiz();
        quiz3.setScore(1);
        quiz3.updateScore(1);
        assertEquals(quiz3.getScore(), 2);
        quiz3.setScore(3);
        quiz3.updateScore(14);
        assertEquals(quiz3.getScore(), 17);
        quiz3.setScore(10);
        quiz3.updateScore(3);
        assertEquals(quiz3.getScore(), 13);
    }

    @Test
    void calculateScore() {
        Quiz quiz4 = new Quiz();
        quiz4.setScore(10);
        assertEquals(quiz4.calculateScore(),10);
        quiz4.setScore(21);
        assertEquals(quiz4.calculateScore(),21);
        quiz4.setScore(17);
        assertEquals(quiz4.calculateScore(),17);
    }
}