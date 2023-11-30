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
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	static public double[][] readFile(File file) {
        try 
        {
            Scanner scanner = new Scanner(file);

            // Determine the number of rows
            int numRows = 0;
            while (scanner.hasNextLine()) {
                numRows++;
                scanner.nextLine();
            }
            scanner.close();

            // Create the 2D ragged array
            double[][] result = new double[numRows][];

            // Read the file again and populate the 2D ragged array
            scanner = new Scanner(file);
            int i = 0;
            while (scanner.hasNextLine()) {
                String[] values = scanner.nextLine().split(" ");
                result[i] = new double[values.length];
                for (int j = 0; j < values.length; j++) {
                    result[i][j] = Double.parseDouble(values[j]);
                }
                i++;
            }
            scanner.close();

            return result;
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            return null;
        }
    }
	
	static public void writeToFile (double [][] arr, File outputFile)
	{
		try 
		{
			if(!outputFile.exists())
			{
				outputFile.createNewFile();
			}
			PrintWriter p = new PrintWriter(outputFile);
			for(int r = 0; r < arr.length; r++)
			{
				for(int c = 0; c < arr[r].length; c++)
				{
					p.print(arr[r][c] + " ");
				}
				p.println();
			}
			p.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public static double getTotal (double [][] arr)
	{
		double sum = 0;
		for(int r = 0; r < arr.length; r++)
		{
			for(int c = 0; c < arr[r].length; c++ )
			{
				sum += arr[r][c];
			}
		}
		return sum;
		
	}
	
	public static double getAverage (double[][] arr)
	{
		double sum = 0;
		int count = 0;
		for(int r = 0; r < arr.length; r++)
		{
			for(int c = 0; c < arr[r].length; c++ )
			{
				sum += arr[r][c];
				count++;
			}
		}
		return sum / count;
	}
	//ask about static	
	public static double getRowTotal (double [][] arr, int index)
	{
		double sum = 0;
		
		for(int i = 0; i < arr[index].length; i++)
		{
			sum += arr[index][i];
		}
		
		return sum;
	}
	
	public static double getColumnTotal (double [][] arr, int index)
	{
		double sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
                
                if (index < arr[i].length) 
                {
                	sum += arr[i][index];
                }  
		}
		return sum;
	}
	
	public static double getHighestInRow (double [][] arr, int index)
	{
		double max = Double.MIN_VALUE;
		
		for(int i = 0; i < arr[index].length; i++)
		{
			if(arr[index][i] > max)
			{
				max = arr[index][i];
			}
		}
		
		return max;
	}
	
	public static int getHighestInRowIndex(double [][] arr, int index)
	{
		double max = Double.MIN_VALUE;
		int count = 0;
		
		for(int i = 0; i < arr[index].length; i++)
		{
			if(arr[index][i] > max)
			{
				max = arr[index][i];
				count = i;
				
			}
		}
		
		return count;
	}
	
	public static double getLowestInRow(double[][] arr, int row)
	{
		double lowest = Double.MAX_VALUE;
		
		for(int i = 0; i < arr[row].length; i++)
		{
			if(arr[row][i] < lowest)
			{
				lowest = arr[row][i];
			}
		}
		return lowest;
		
	}
	
	public static int getLowestInRowIndex(double [][] arr, int row)
	{
		double lowest = Double.MAX_VALUE;
		int count = 0;
		
		for(int i = 0; i < arr[row].length; i++)
		{
			if(arr[row][i] < lowest)
			{
				lowest = arr[row][i];
				count = i;
			}
		}
		
		return  count;
	}
	
	public static double getHighestInColumn(double [][] arr, int col)
	{
		double max = Double.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
                
                if (col < arr[i].length) 
                {
                	if(arr[i][col] > max)
                	{
                		max = arr[i][col];
                	}
                }
		}
		return max;
	}
	
	public static int getHighestInColumnIndex(double [][] arr, int col)
	{
		double max = Double.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
                
                if (col < arr[i].length) 
                {
                	if(arr[i][col] > max)
                	{
                		max = arr[i][col];
                		count = i;
                	}
                }
		}
		return count;
	}
	
	public static double getLowestInColumn(double [][]arr, int col)
	{
		double min = Double.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
                
                if (col < arr[i].length) 
                {
                	if(arr[i][col] < min)
                	{
                		min = arr[i][col];
                	}
                }
		}
		return min;
	}
	
	public static int getLowestInColumnIndex(double [][] arr, int col)
	{
		double min = Double.MAX_VALUE;
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
                
                if (col < arr[i].length) 
                {
                	if(arr[i][col] < min)
                	{
                		min = arr[i][col];
                		count = i;
                	}
                }
		}
		return count;
	}
	
	public static double getHighestInArray(double [][] arr)
	{
		double max = Double.MIN_VALUE;
		for(int r = 0; r < arr.length; r++)
		{
			for(int c = 0; c < arr[r].length; c++)
			{
				if(arr[r][c] > max)
				{
					max = arr[r][c];
				}
			}
		}
		return max;
	}
	
	public static double getLowestInArray(double[][] arr)
	{
		double min = Double.MAX_VALUE;
		for(int r = 0; r < arr.length; r++)
		{
			for(int c = 0; c < arr[r].length; c++)
			{
				if(arr[r][c] < min)
				{
					min = arr[r][c];
				}
			}
		}
		return min;
	}
	
}
