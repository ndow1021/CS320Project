public class QuizController {

    private int score;
    private Quiz model;
    public int getScore()
    {
        return score;
    }
    public void setScore(int number)
    {
        score = number;
    }
    public void addToScore(int number)
    {
        score = score + number;
    }
    public void setModel(Quiz model) {
        this.model = model;
    }



}
