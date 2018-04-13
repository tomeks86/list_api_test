package edu.tseidler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ReflectionTest {
    public static void main(String[] args) {
        Arrays.stream(ListInterfaceTest.class.getMethods())
                .filter(m -> m.getName().startsWith("should"))
                .filter(m -> Modifier.isPublic(m.getModifiers()))
                .filter(m -> Modifier.isStatic(m.getModifiers()))
                .forEach(m -> {
                    invoke(m);
                });
    }

    private static void invoke(Method m) {
        try {
            m.invoke(null, new ArrayList());
            m.invoke(null, new LinkedList());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
