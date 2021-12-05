package automationtextgenerator;

public class SpecializedTextGenerator extends automationtextgenerator.TextGenerator {
    private String dear;
    private String memberOfFamily;
    private String comma;

    public SpecializedTextGenerator(String exclamationMark, String mainText, String dear, String memberOfFamily, String comma) {
        super(exclamationMark, mainText);
        this.dear = dear;
        this.memberOfFamily = memberOfFamily;
        this.comma = comma;
    }

    public String getDear() {
        return dear;
    }

    public void setDear(String dear) {
        this.dear = dear;
    }

    public String getMemberOfFamily() {
        return memberOfFamily;
    }

    public void setMemberOfFamily(String memberOfFamily) {
        this.memberOfFamily = memberOfFamily;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    @Override
    public void show_generatedText() {
        System.out.println(dear + memberOfFamily + comma + getMainText() + getExclamationMark());
    }
}
