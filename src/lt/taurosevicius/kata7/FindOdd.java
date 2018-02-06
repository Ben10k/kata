package lt.taurosevicius.kata7;

import java.util.HashSet;
import java.util.Set;

public class FindOdd {
    public static int findIt(int[] A) {
        Set<Integer> set = toSetContainingOddValues(A);

        return extract(toSetContainingOddValues(A));
    }

    private static Set<Integer> toSetContainingOddValues(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int number : A)
            if (!set.add(number))
                set.remove(number);

        return set;
    }

    private static int extract(Set<Integer> set) {

        if (set.size() == 1)
            return (int) set.toArray()[0];

        throw (!set.isEmpty()) ?
                new MoreThanOneValueRepeatedOddNumberOfTimesException() :
                new NoValueRepeatedOddNumberOfTimesException();

    }

    public static class NoValueRepeatedOddNumberOfTimesException extends RuntimeException {

    }

    public static class MoreThanOneValueRepeatedOddNumberOfTimesException extends RuntimeException {

    }
}