package junitproject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import com.day1.*;
class methodparameter {
	@ParameterizedTest
	@MethodSource("methodresource")
	void testmethod( int expected ,int a,int b) {
		Calculator c=new Calculator();
		assertEquals(expected,c.add(a,b));
	}
	static Object[][] methodresource( ){
		return new Object[][]{
			{3,1,2},
			{7,3,4},
			{10,6,4},
		};
		}
	}


