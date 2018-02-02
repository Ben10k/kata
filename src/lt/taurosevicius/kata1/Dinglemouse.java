package lt.taurosevicius.kata1;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        return new int[]{humanYears, animalYears(humanYears, 4), animalYears(humanYears, 5)};
    }

    private static int animalYears(final int humanYears, int yearsOfAnimal) {
        if (humanYears == 1) return 15;
        if (humanYears == 2) return 24;
        return 24 + (humanYears - 2) * yearsOfAnimal;
    }

}