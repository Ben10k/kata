package lt.taurosevicius.kata2;

class Kata {
    public static String getMiddle(String word) {
        //Code goes here!

        return ((word.length() > 2) ? getMiddle(word.substring(1, word.length() - 1)) : word);

//        if (word.length() > 2)
//            return getMiddle(word.substring(1, word.length() - 1));
//        else
//            return word;

//        int l = word.length();
//        if (l % 2 == 1)
//            return word.substring(l / 2, l / 2 + 1);
//        else
//            return word.substring(l / 2 - 1, l / 2 + 1);
    }
}