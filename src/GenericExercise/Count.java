package GenericExercise;

import java.util.*;

public class Count {
    public static <E> int countCollection(Collection<E> collection) {
        int count = 0;
        for(E i : collection) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        ArrayList<?> listString = new ArrayList<>();
        System.out.println("Number of element is "+ countCollection(listString) );
    }
}
