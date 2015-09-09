package testForJenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCase {
	
	testForJenkins sc = new testForJenkins();

	@Test
	public void AddTest() {         
			        int c = sc.Add(3, 5);    		         
			        assertEquals(8,c);        
			    }

}
