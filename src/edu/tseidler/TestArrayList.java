package edu.tseidler;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static void shouldAddElementToList() {
        // given
        List test = new ArrayList();

        // when


        // then
        assert test.add(new Object()) : "failed to add element";
    }
    
    public static void shouldAddTheSameElementToList() {
        // given
        List test = new ArrayList();
        Object testObj = new Object();
    
        // when
        test.add(testObj);
    
        // then
        assert test.add(testObj) : "failed to add the same element to list";
    }

    public static void shouldRemoveObjectFromList() {
        // given
        List test = new ArrayList();

        // when
        Object testObj = new Object();
        test.add(testObj);

        // then
        assert test.remove(testObj) : "tested object cannot be removed from list";
    }

    public static void shouldRemoveElementByIndex() {
        // given
        List test = new ArrayList();

        // when
        Object testObj = new Object();
        test.add(testObj);

        // then
        assert testObj.equals(test.remove(0)) : "element 0 removed from list differs from original";
    }

    public static void shouldNotRemoveObjectFromListWhenAbsent() {
        // given
        List test = new ArrayList();

        // when
        Object testObj = new Object();
        Object testObj2 = new Object();
        test.add(testObj);

        // then
        assert !test.remove(testObj2) : "second object really present in the list?";
    }

    public static void shouldNotRemoveFromWrongIndexPosition() {
        // given
        List test = new ArrayList();
        boolean thrown = false;

        // when
        test.add(new Object());
        test.add(new Object());
        try {
            test.remove(2);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }

        // then
        assert thrown : "object at index 2 strangely found";
    }
    
    public static void shouldContainAllCollection() {
        // given
        List test = new ArrayList();
    
        // when
        test.add(1);
        test.add(2);
        test.add(3);
        Integer[] elements = {1, 2, 3, 3};
    
        // then
        assert test.containsAll(Arrays.asList(elements)) : "list doesn't contain specified collection";
    }

    public static void shouldContainSubcollection() {
        // given
        List test = new ArrayList();

        // when
        test.add(1);
        test.add(2);
        test.add(3);
        Integer[] elements = {1, 2};

        // then
        assert test.containsAll(Arrays.asList(elements)) : "list doesn't contain sublist";
    }

    public static void shouldNotContainCollection() {
        // given
        List test = new ArrayList();

        // when
        test.add(1);
        test.add(2);
        Integer[] elements = {1, 2, 3};

        // then
        assert !test.containsAll(Arrays.asList(elements)) : "list strangely contains a larger collection";
    }

    public static void shouldAddAllElements() {
        // given
        List test = new ArrayList();

        // when
        Integer[] elements = {1, 2, 3};

        // then
        assert test.addAll(Arrays.asList(elements)) : "failed the addAll for collection of elements";
    }

    public static void shouldContainElementsAfterAddAll() {
        // given
        List test = new ArrayList();

        // when
        Integer[] elements = {1, 2, 3};
        test.addAll(Arrays.asList(elements));

        // then
        assert test.containsAll(Arrays.asList(elements)) : "list doesn't contain added collection";
    }

    public static void shouldContainElementsAfterAddAllToNonEmptyList() {
        // given
        List test = new ArrayList();
        test.add(5);

        // when
        Integer[] elements = {1, 2, 3};
        test.addAll(Arrays.asList(elements));

        // then
        assert test.containsAll(Arrays.asList(elements)) : "list doesn't contain added collection";
    }
    
    public static void shouldAddElementsAtIndex() {
        // given
        List test = new ArrayList();
        test.add(1);
        test.add(2);
        test.add(5);
    
        // when
        Integer[] elements = {3, 4};
        test.addAll(2, Arrays.asList(elements));
    
        // then
        assert test.get(3).equals(4) : "insertion with addAll on position 2 failed";
    }

    public static void shouldRemoveAllSelectedElements() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}));

        // when
        test.removeAll(Arrays.asList(new Integer[] {1, 3, 5}));

        // then
        assert !test.containsAll(Arrays.asList(new Integer[] {1, 3, 5})) : "list contains deleted elements";
    }

    public static void shouldContainTwoElementsAfterRemoveAll() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}));

        // when
        test.removeAll(Arrays.asList(new Integer[] {1, 3, 5}));

        // then
        assert test.size() == 2 : "removeAll didn't remove 3 elements";
    }
    
    public static void shouldContainThreeElementsAfterRetainAllWhenAllInList() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}));
    
        // when
        test.retainAll(Arrays.asList(new Integer[] {1, 3, 5}));
    
        // then
        assert test.size() == 3 : "different than 3 number of elements retained in the list";
    }

    public static void shouldContainTwoElementsAfterRetainAllWhenNotAllInList() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}));

        // when
        test.retainAll(Arrays.asList(new Integer[] {1, 3, 7}));

        // then
        assert test.size() == 2 : "different than 2 number of elements retained in the list";
    }
    
    public static void shouldReplaceAllIntegersByFive() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4}));
    
        // when
        test.replaceAll(i -> 5);
    
        // then
        assert !test.containsAll(Arrays.asList(new Integer[] {1, 2, 3, 4})) : "replaceAll not applied to list implementation";
    }

    public static void shouldSortArrayAscending() {
        // given
        List<Integer> test = new ArrayList<>();
        test.addAll(Arrays.asList(new Integer[] {1, 4, 3, 2}));

        // when
        test.sort((i, j) -> i.compareTo(j));

        // then
        assert test.get(0) == 1 : "1 not on first position";
        assert test.get(1) == 2 : "2 not on first position";
        assert test.get(2) == 3 : "3 not on first position";
        assert test.get(3) == 4 : "4 not on first position";
    }

    public static void shouldSortArrayDescending() {
        // given
        List<Integer> test = new ArrayList<>();
        test.addAll(Arrays.asList(new Integer[] {1, 4, 3, 2}));

        // when
        test.sort((i, j) -> j.compareTo(i));

        // then
        assert test.get(0) == 4 : "4 not on first position";
        assert test.get(1) == 3 : "3 not on first position";
        assert test.get(2) == 2 : "2 not on first position";
        assert test.get(3) == 1 : "1 not on first position";
    }

    public static void shouldYieldZeroSizeAfterClear() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4}));

        // when
        test.clear();

        // then
        assert test.size() == 0 : "list size after clear different than zero";
    }

    public static void shouldYieldZeroSizeAfterClearOfEmptyList() {
        // given
        List test = new ArrayList();

        // when
        test.clear();

        // then
        assert test.size() == 0 : "list size after clear different than zero";
    }
    
    public static void shouldGiveElementFromPosition() {
        // given
        List test = new ArrayList();
        Object one = new Object();
        Object two = new Object();
        Object three = new Object();
        test.addAll(Arrays.asList(new Object[] {one, two, three}));
    
        // when
        Object second = test.get(1);
    
        // then
        assert second.equals(two) : "second element got from list different than two";
    }

    public static void shouldThrowIOBExceptionWhenListEmpty() {
        // given
        List test = new ArrayList();
        boolean thrown = false;

        // when
        try {
            Object myObj = test.get(0);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }

        // then
        assert thrown : "IndexOutOfBoundsException not thrown after get from empty list";
    }

    public static void shouldThrowIOBExceptionWhenIndexNegative() {
        // given
        List test = new ArrayList();
        test.add(new Object());
        boolean thrown = false;

        // when
        try {
            Object myObj = test.get(-5);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }

        // then
        assert thrown : "IndexOutOfBoundsException not thrown after get from empty list";
    }

    public static void shouldChangeValueOfElementWithSet() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 1, 1, 1}));

        // when
        test.set(2, 5);

        // then
        assert test.get(0).equals(1) : "1st element is not 1";
        assert test.get(1).equals(1) : "2nd element is not 1";
        assert test.get(2).equals(5) : "3rd element is not 5";
        assert test.get(3).equals(1) : "4th element is not 1";
    }

    public static void shouldThrowIOBExceptionWhenSetOnEMptyList() {
        // given
        List test = new ArrayList();
        boolean thrown = false;

        // when
        try {
            test.set(0, 5);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }

        // then
        assert thrown : "IndexOutOfBoundsException not thrown when set used on an empty list";
    }

    public static void shouldThrowIOBExceptionWhenSetWithNegativeIndex() {
        // given
        List test = new ArrayList();
        test.add(new Object());
        boolean thrown = false;

        // when
        try {
            test.set(-1, 5);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }

        // then
        assert thrown : "IndexOutOfBoundsException not thrown when set used with negative index";
    }

    public static void shouldAddElementToEmptyListAtPositionZero() {
        // given
        List test = new ArrayList();

        // when
        test.add(0, 5);

        // then
        assert test.size() == 1 : "list size not equal to 1";
        assert test.get(0).equals(5) : "first element different than 5";
    }

    public static void shouldThrowIOBExceptionWhenAddElementToEmptyListAtPositionOne() {
        // given
        List test = new ArrayList();
        boolean thrown = false;

        // when
        try {
            test.add(1, 5);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }

        // then
        assert thrown : "IndexOutOfBoundsException not thrown on add at illegal position of empty list";
    }

    public static void shouldAddElementAtSpecifiedPosition() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4}));

        // when
        test.add(1, 5);

        // then
        assert test.size() == 5 : "list size not equal to 5 (add failed)";
        assert test.get(0).equals(1) : "1st element different than 1";
        assert test.get(1).equals(5) : "2nd element different than 5";
        assert test.get(2).equals(2) : "3rd element different than 2";
        assert test.get(3).equals(3) : "4th element different than 3";
        assert test.get(4).equals(4) : "5th element different than 4";
    }

    public static void shouldFindObjectAtPositionZero() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4}));

        // when
        int ind = test.indexOf(3);

        // then
        assert ind == 2 : "indexOf result differ from expected for element";
    }

    public static void shouldReturnMinusOneWhenNotFoundInList() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4}));

        // when
        int ind = test.indexOf(5);

        // then
        assert ind == -1 : "indexOf strangely found element absent in the list";
    }

    public static void shouldReturnIndexOfLastOccurenceOfANumber() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 1, 2, 3, 4}));

        // when
        int ind = test.lastIndexOf(2);

        // then
        assert ind == 3 : "index of last occurence different than expected";
    }

    public static void shouldReturnMinusOneWithLastIndexOfWhenNotInAList() {
        // given
        List test = new ArrayList();
        test.addAll(Arrays.asList(new Integer[] {1, 2, 1, 2, 3, 4}));

        // when
        int ind = test.lastIndexOf(5);

        // then
        assert ind == -1 : "index of last occurence different than -1 for element not in the list";
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
        
        // add
        shouldAddElementToList();
        shouldAddTheSameElementToList();
        shouldAddElementToEmptyListAtPositionZero();
        shouldThrowIOBExceptionWhenAddElementToEmptyListAtPositionOne();
        shouldAddElementAtSpecifiedPosition();

        // remove
        shouldRemoveObjectFromList();
        shouldRemoveElementByIndex();
        shouldNotRemoveObjectFromListWhenAbsent();
        shouldNotRemoveFromWrongIndexPosition();
        
        // containsAll
        shouldContainAllCollection();
        shouldContainSubcollection();
        shouldNotContainCollection();

        // addAll
        shouldAddAllElements();
        shouldContainElementsAfterAddAll();
        shouldContainElementsAfterAddAllToNonEmptyList();
        shouldAddElementsAtIndex();

        // removeAll
        shouldRemoveAllSelectedElements();
        shouldContainTwoElementsAfterRemoveAll();
        
        // retainAll
        shouldContainThreeElementsAfterRetainAllWhenAllInList();
        shouldContainTwoElementsAfterRetainAllWhenNotAllInList();
        
        // replaceAll
        shouldReplaceAllIntegersByFive();

        // sort
        shouldSortArrayAscending();
        shouldSortArrayDescending();

        // clear
        shouldYieldZeroSizeAfterClear();
        shouldYieldZeroSizeAfterClearOfEmptyList();
        
        // get
        shouldGiveElementFromPosition();
        shouldThrowIOBExceptionWhenListEmpty();
        shouldThrowIOBExceptionWhenIndexNegative();

        // set
        shouldChangeValueOfElementWithSet();
        shouldThrowIOBExceptionWhenSetOnEMptyList();
        shouldThrowIOBExceptionWhenSetWithNegativeIndex();

        // indexOf
        shouldFindObjectAtPositionZero();
        shouldReturnMinusOneWhenNotFoundInList();

        // lastIndexOf
        shouldReturnIndexOfLastOccurenceOfANumber();
        shouldReturnMinusOneWithLastIndexOfWhenNotInAList();
    }
}
