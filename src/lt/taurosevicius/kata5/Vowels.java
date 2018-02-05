package lt.taurosevicius.kata5;

import java.util.ArrayList;
import java.util.List;

public class Vowels {


    private static List<Character> VowelList() {
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return vowels;
    }

    public static int getCount(String str) {
        if (str == null || str.length() == 0) return 0;
        else return new VowelCounter(VowelList()).getVowelCount(str.toLowerCase());

    }


    private static class VowelCounter {
        private final List<Character> vowels;

        public VowelCounter(List<Character> vowels) {
            this.vowels = vowels;
        }

        private int getVowelCount(String lowercaseString) {
            int vowelCount = 0;

            for (int i = 0; i < lowercaseString.length(); i++)
                if (vowels.contains(lowercaseString.charAt(i)))
                    vowelCount++;

            return vowelCount;
        }
    }

}
