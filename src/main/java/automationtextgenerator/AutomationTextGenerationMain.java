package automationtextgenerator;


import java.util.*;

public class AutomationTextGenerationMain {
    public static void main(String[] args) {
        char exclamationMark = '!';
        char comma = ',';

        Map<String, String> mainTexts = new HashMap<String, String>();
        mainTexts.put("main text example", "You can type any text here");
        mainTexts.put("happy new year text", "We wish you a Happy New Year");
        mainTexts.put("happy birthday", "we congratulate you with a Happy Birthday");

        String mainTextExample = mainTexts.get("main text example");
        String mainTextNewYear = mainTexts.get("happy new year text");
        String mainTextBirthday = mainTexts.get("happy birthday");
        String dear = "Dear";

        Map<String, String> membersOfFamily = new HashMap<String, String>();
        membersOfFamily.put("mother", "mommy");
        membersOfFamily.put("father", "daddy");
        membersOfFamily.put("grand mother", "granny");

        String firstMemberOfFamily = membersOfFamily.get("mother");
        String secondMemberOfFamily = membersOfFamily.get("father");
        String thirdMemberOfFamily = membersOfFamily.get("grand mother");


        List<TextGenerator> textGenerator =
                new ArrayList<TextGenerator>();
        textGenerator
                .add(new TextGenerator(exclamationMark, mainTextExample));
        textGenerator
                .add(new TextGenerator(exclamationMark, mainTextNewYear));
        for (TextGenerator list : textGenerator) {
            list.show_generatedText();
        }

        List<SpecializedTextGenerator> textGeneratorForBirthday =
                new ArrayList<SpecializedTextGenerator>();
        textGeneratorForBirthday
                .add(new SpecializedTextGenerator(exclamationMark, mainTextBirthday, dear, firstMemberOfFamily,
                        comma));
        textGeneratorForBirthday
                .add(new SpecializedTextGenerator(exclamationMark, mainTextBirthday, dear, secondMemberOfFamily,
                        comma));
        textGeneratorForBirthday
                .add(new SpecializedTextGenerator(exclamationMark, mainTextBirthday, dear, thirdMemberOfFamily,
                        comma));
        for (SpecializedTextGenerator list : textGeneratorForBirthday) {
            list.show_generatedText();
        }

    }

}
