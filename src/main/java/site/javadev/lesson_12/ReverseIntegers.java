package site.javadev.lesson_12;

import java.util.Comparator;

public class ReverseIntegers implements Comparator<Integer> {
    @Override
    public int compare(Integer integer1, Integer integer2) {
        return integer1 - integer2;
    }
}
