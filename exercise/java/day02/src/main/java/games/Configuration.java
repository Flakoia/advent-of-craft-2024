package games;

import io.vavr.collection.LinkedHashMap;
import io.vavr.collection.Map;

public class Configuration {
    public static final int MIN = 1;
    public static final int MAX = 100;
    public static final Map<Integer, String> mapping = LinkedHashMap.of(
            15, "FizzBuzz",
            3, "Fizz",
            5, "Buzz",
            7, "Whizz",
            11, "Bang"
    );
}
