import javax.swing.text.html.HTMLDocument;

public class Quiz {


    private int questionScore;


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
       // Score.updateScore(questionScore);


    }

    public void nextQuestion(){
        //go to the next question and save the results
        saveInProgress();
    }





}
