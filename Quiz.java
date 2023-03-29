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
       /* // Load input HTML file from URL
        HTMLDocument document = new HTMLDocument("https://www.aspose.com/");

        // Initialize PdfSaveOptions class object and set the encryption properties
        PdfSaveOptions options = new PdfSaveOptions();
        options.setEncryption(new PdfEncryptionInfo("user", "owner", PdfPermissions.PrintDocument, PdfEncryptionAlgorithm.RC4_128));

        // Save output PDF file with encryption
        Converter.convertHTML(document, options, "URLtoPDF_encrypted.pdf");*/
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
