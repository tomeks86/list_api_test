package edu.tseidler;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void shouldGiveZeroSize() {
        // given
        List test = new ArrayList();

        // when


        // then
        assert test.size() == 0 : "non-zero size!";
    }

    public static void shouldGiveSizeOfOne() {
        // given
        List test = new ArrayList();

        // when
        test.add(new Object());

        // then
        assert test.size() == 1 : "size should be 1!";
    }

    public static void shouldGiveZeroSizeAfterAdditionAndRemoval() {
        // given
        List test = new ArrayList();

        // when
        test.add(new Object());
        test.remove(0);

        // then
        assert test.size() == 0 : "size should be again 0!";
    }

    public static void shouldReturnTrueForEmpty() {
        // given
        List test = new ArrayList();

        // when

        // then
        assert test.isEmpty() : "array not empty!";
    }

    public static void shouldReturnFalseForNonEmpty() {
        // given
        List test = new ArrayList();

        // when
        test.add(new Object());

        // then
        assert !test.isEmpty() : "array is empty!";
    }

    public static void shouldNotContainNumber() {
        // given
        List test = new ArrayList();

        // when
        test.add(1);

        // then
        assert !test.contains(2) : "array contains number 2";
    }

    public static void shouldContainNumber() {
        // given
        List test = new ArrayList();

        // when
        test.add(1);
        test.add(2);

        // then
        assert test.contains(2) : "array doesn't contain number 2";
    }

    public static void shouldProduceEmptyArray() {
        // given
        List test = new ArrayList();

        // when
        Object[] array = test.toArray();

        // then
        assert array.length == 0 : "array not empty";
    }

    public static void shouldProduceArrayWith3Integers() {
        // given
        List test = new ArrayList();

        // when
        test.add(1);
        test.add(2);
        test.add(3);
        Object[] array = test.toArray();

        // then
        assert array.length == 3 : "array doesn't contain 3 elements";
    }

    public static void main(String[] args) {
        // size
        shouldGiveZeroSize();
        shouldGiveSizeOfOne();
        shouldGiveZeroSizeAfterAdditionAndRemoval();

        // isEmpty
        shouldReturnTrueForEmpty();
        shouldReturnFalseForNonEmpty();

        // contains
        shouldNotContainNumber();
        shouldContainNumber();

        // toArray
        shouldProduceEmptyArray();
        shouldProduceArrayWith3Integers();
    }
}
