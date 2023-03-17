public class Score {

    private int score;
    public int getScore()
    {
        return score;
    }
    public void setScore(int score)
    {
        this.score = score;
    }

    public void updateScore(int addedValue)
    {
        setScore(score + addedValue);

    }







}
