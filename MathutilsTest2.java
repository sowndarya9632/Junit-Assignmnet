package junitproject;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathutilsTest2 {
	private MathUtils m;
	
	@BeforeEach
	public void pro3() {
		m = new MathUtils();	
	}
	
   @Test
	public void pro() {
		//m = new MathUtils();
		assertEquals(5, m.add(2,3));
	}
   @Test
	public void pro1() {
		//m=new MathUtils();
		assertNotEquals(4,m.add(2, 3));
	}
   @Test
	public void pro2() {
		//m=new MathUtils();
		assertFalse(m.ispositive(-6));
	}
    @Test
	public void pro4() {
    	m=new MathUtils();
		assertNull(m.isnull(m));
	}
    @Test
   	public void pro5() {
   		assertThrows(ArithmeticException.class,()->m.divide(1,0));
   	}

	
}

