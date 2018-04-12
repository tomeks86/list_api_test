package edu.tseidler;

import java.util.LinkedList;
import java.util.List;

public class SoftAssert {
    List<Assertion> assertions;
    StringBuilder msg = new StringBuilder();

    public SoftAssert() {
        assertions = new LinkedList<>();
    }

    public void runAllTests() {
        for (int i = 0; i < assertions.size(); i++) {
            Assertion assertion = assertions.get(i);
            try {
                assert assertion.assertion : assertion.message;
            } catch (AssertionError ae) {
                msg.append("\n" + assertion.message + ": (subtest: " + (i+1) + ")");
            }
        }
        if (!msg.toString().isEmpty()) throw new AssertionError(msg.toString());
    }

    public void add(boolean assertion, String message) {
        assertions.add(new Assertion(assertion, message));
    }

    private class Assertion {
        boolean assertion;
        String message;

        public Assertion(boolean assertion, String message) {
            this.assertion = assertion;
            this.message = message;
        }
    }
}
