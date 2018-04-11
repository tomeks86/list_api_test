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

    public static void main(String[] args) {
        // size
        shouldGiveZeroSize();
        shouldGiveSizeOfOne();
        shouldGiveZeroSizeAfterAdditionAndRemoval();

        // isEmpty
        shouldReturnTrueForEmpty();
        shouldReturnFalseForNonEmpty();
    }
}
