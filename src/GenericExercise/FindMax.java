package GenericExercise;

public final class FindMax {
    public static <T extends Integer> T max(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }

    public static void main(String[] args) {
        System.out.println("Max of 3 and 4 : "+ max(3,4));
    }
}
