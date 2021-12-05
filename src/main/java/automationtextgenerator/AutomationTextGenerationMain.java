package automationtextgenerator;


import java.util.ArrayList;
import java.util.List;

public class AutomationTextGenerationMain {
    public static void main(String[] args) {

        List<TextGenerator> textGenerator =
                new ArrayList<TextGenerator>();
        textGenerator
                .add(new TextGenerator("!", "You can type any kind of text here"));
        textGenerator
                .add(new TextGenerator("!", "We wish you a Happy New Year"));
        for (TextGenerator list : textGenerator) {
            list.show_generatedText();
        }

        List<SpecializedTextGenerator> textGeneratorForBirthday =
                new ArrayList<SpecializedTextGenerator>();
        textGeneratorForBirthday
                .add(new SpecializedTextGenerator("!", "Dear ", "granny", ",",
                        "we congratulate you with a Happy Birthday"));
        textGeneratorForBirthday
                .add(new SpecializedTextGenerator("!", "Dear ", "daddy", ",",
                        "we congratulate you with a Happy Birthday"));
        textGeneratorForBirthday
                .add(new SpecializedTextGenerator("!", "Dear ", "mommy", ",",
                        "we congratulate you with a Happy Birthday"));
        for (SpecializedTextGenerator list : textGeneratorForBirthday) {
            list.show_generatedText();
        }

    }

}
