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
public class HolidayBonus {
	
	static final double HIGHEST = 5000;
	static final double LOWEST = 1000;
	static final double OTHER = 2000;
	
	static double [] calculateHolidayBonus(double [][] data)
	{
		double [] bonus = new double [data.length];
		
		for(int r = 0; r < data.length; r++)
		{
			for(int c = 0; c < data[r].length; c++)
			{
				if(data[r][c] <= 0)
				{
					bonus[r] += 0;
				}
				else if(data[r][c] == TwoDimRaggedArrayUtility.getHighestInColumn(data, c))
				{
					bonus[r] += HIGHEST;
				}
				else if(data[r][c] == TwoDimRaggedArrayUtility.getLowestInColumn(data, c))
				{
					bonus[r] += LOWEST;
				}
				else 
				{
					bonus[r] += OTHER;
				}
			}
		}
		return bonus;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double total = 0;
		for(int r = 0; r < data.length; r++)
		{
			for(int c = 0; c < data[r].length; c++)
			{
				if(data[r][c] <= 0)
				{
					total += 0;
				}
				else if(data[r][c] == TwoDimRaggedArrayUtility.getHighestInColumn(data, c))
				{
					total += HIGHEST;
				}
				else if(data[r][c] == TwoDimRaggedArrayUtility.getLowestInColumn(data, c))
				{
					total += LOWEST;
				}
				else 
				{
					total += OTHER;
				}
			}
		}
		return total;
	}

}
