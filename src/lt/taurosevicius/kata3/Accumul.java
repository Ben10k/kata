package lt.taurosevicius.kata3;

// http://www.codewars.com/kata/5667e8f4e3f572a8f2000039/
public class Accumul {

    public static String accum(String s) {
        String newString = s.replaceAll("[^a-zA-Z]", "");
        if (s.length() != newString.length() || s.length() == 0)
            return null;
        return extendString(s);
    }

    private static String extendString(String in) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < in.length(); i++) {
            out.append(in.toUpperCase().substring(i, i + 1));
            for (int j = 0; j < i; j++)
                out.append(in.toLowerCase().substring(i, i + 1));
            if (i != in.length() - 1)
                out.append("-");
        }
        return out.toString();
    }
}
