package junitproject;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Timeout;

import com.day1.TDD;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class TddDemonstrate {
	TddDemonstrate() {
		System.out.println("it excute once");
	}

	@Test
	void test() {
		TDD t = new TDD();
		assertEquals(4, t.squareOfShape(2), () -> "area of square incorrect");// it evaluate only it fail
	}

	@Test
	@Timeout(value = 01, unit = TimeUnit.SECONDS)
	void testcircle() {
		TDD t = new TDD();
		assertEquals(78.5, t.squareOfcircle(5), "area of circle in correct");// it evaluate all time
	}

}
