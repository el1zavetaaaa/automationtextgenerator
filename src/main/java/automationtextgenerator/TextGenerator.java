package automationtextgenerator;

public class TextGenerator {
    private char exclamationMark;
    private String mainText;

    public TextGenerator(char exclamationMark, String mainText) {
        this.exclamationMark = exclamationMark;
        this.mainText = mainText;
    }

    public char getExclamationMark() {
        return exclamationMark;
    }

    public void setExclamationMark(char exclamationMark) {
        this.exclamationMark = exclamationMark;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public void show_generatedText() {
        System.out.println(mainText + exclamationMark);
    }
}
