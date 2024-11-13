package junitproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day1.SortingArray;

class SortingArryaTest {
  
	@Test
	void testArray() {
		
		SortingArray s = new SortingArray();
		int[] a = null;
		assertThrows(NullPointerException.class,()->s.sortArray(a));

}
}
