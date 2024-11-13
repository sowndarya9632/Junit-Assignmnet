package junitproject;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import com.day1.PerformanceTest;

class PerformanceTesting {

	@Test
	void testPerformance() {
		PerformanceTest c= new PerformanceTest();
		int a[]= {2,5,1};
		assertTimeout(Duration.ofMillis(1),()->c.sortArray(a));
	}

}
