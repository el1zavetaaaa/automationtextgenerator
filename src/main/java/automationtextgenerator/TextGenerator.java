package automationtextgenerator;

public class TextGenerator {
    private String exclamationMark;
    private String mainText;

    public TextGenerator(String exclamationMark, String mainText) {
        this.exclamationMark = exclamationMark;
        this.mainText = mainText;
    }

    public String getExclamationMark() {
        return exclamationMark;
    }

    public void setExclamationMark(String exclamationMark) {
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
