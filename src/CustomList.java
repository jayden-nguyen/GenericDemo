import java.util.ArrayList;

public class CustomList<T> extends ArrayList<T> {
    public static void main(String[] args) {
        CustomList<String> customListString = new CustomList<>();
        customListString.add("this is string");
        System.out.println(customListString.get(0));
    }
}
