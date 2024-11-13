package junitproject;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.StringJoiner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValueParameter {

	@ParameterizedTest
	@ValueSource(strings= {"ii","121","beb"})
	void ispoly(String s ) {
		assertTrue(ispalidrome(s));
	}
	public boolean ispalidrome(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
		
	
	
	
	
	/*@ValueSource(ints= {2,1,4,6,8,})
	void is(int number) {
     assertTrue(number%2==0);*/	
}

}
