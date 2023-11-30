/* 

 * Class: CMSC203  

 * Instructor: Professor Monshi

 * Description: (This program makes a TwoDimArray Utility list which has a lot 
of methods that calculate different columns and rows and gets the highest and 
lowest. Then in the HolidayBonus class it retuns a 2d array for the bonuses in 
a row. Then gets the total of all bonuses.)

 * Due: 11/30/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming assignment independently. 

*  I have not copied the code from a student or any source.  

*  I have not given my code to any student. 

*  Print your Name here: Iban Vasquez

*/ 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {
	
	private double[][] dataSet1 = { { 10, 20, 40, 0 }, { 2, 5, 8 }, { 20, 17, 3, 6 } };

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculateHolidayBonus() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(12000, result[0], .001);
			assertEquals(4000.0, result[1], .001);
			assertEquals(13000.0, result[2], .001);
		} 
		catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}

	@Test
	void testCalculateTotalHolidayBonus() {
		assertEquals(29000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
	}

}
