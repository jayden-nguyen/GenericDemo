import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Box {
    private Object t;

    public void set(Object t) {
        this.t = t;
    }

    public Object get() {
        return t;
    }

    public static void main(String[] args) {
        Box box = new Box();
        String test = "test";
        int testInt = 2;
        box.set(testInt);
        System.out.println(box.get());
        java.util.List<Integer> intTest = new ArrayList<>();
        List<? extends Number> numTest = intTest;
    }
}
