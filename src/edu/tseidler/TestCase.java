package edu.tseidler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    int failed = 0;
    int run = 0;
    StringBuilder messages = new StringBuilder("test summary: \n");

    public void run(Method method) {
        try {
            ReflectionTest.invoke(method);
        } catch (AssertionError | InvocationTargetException | IllegalAccessException e) {
            failed++;
            messages.append("test number: " + (run + 1) + " failed (" + method.getName() + ")\n");
        } finally {
            run++;
        }
    }

    public void finalMessages() {
        messages.append("tests run: " + run + "\n");
        messages.append("tests failed: " + failed + "\n");
        System.out.println(messages.toString());
    }
}
