import javax.swing.text.html.HTMLDocument;

public class Quiz {


    private int questionScore;
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

    public int calculateScore()
    {
        return score;
    }


    public void saveAsPDF()
    {
        // Load input HTML file from URL
        //HTMLDocument document = new HTMLDocument("QuizResults.html");

        // Initialize PdfSaveOptions class object
        // PdfSaveOptions options = new PdfSaveOptions();


        // Save webpage as PDF in Java
        //Converter.convertHTML(document, options, "URLtoPDF.pdf");
    }



    public void saveInProgress()
    {
        updateScore(questionScore);


    }

    public void nextQuestion(){
        //go to the next question and save the results
        saveInProgress();
    }





}
