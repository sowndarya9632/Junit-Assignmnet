package junitproject;

import java.util.function.BooleanSupplier;

public class MathUtils {
	public int add(int a, int b) {
		return a + b;
	}

	public Boolean ispositive(int i) {
		return i > 0;
	}

	public String isnull(Object o) {
		if (o == null) {
			return null;
		}
		return o+"o";

	}

	public int divide(int i, int j) {
		return i/j;
	}
}
