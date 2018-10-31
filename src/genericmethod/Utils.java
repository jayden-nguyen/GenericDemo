package genericmethod;

public class Utils{
    public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(2, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "apple");
        boolean same = Utils.compare(p1, p2);
        System.out.println(same);
    }
}
