/* Logic to draw the following X Patterns.
	*___________*
	___*_____*
	______*
	___*_____*
	*___________*
*/
class XPattern {
	public static void main (String[] args)
	{
	int row_max=5;  // initialize maximum rows
	int col_max=12; // initialize maximum columns
		for (int row=0; row<row_max; row++) //For loop for rows
		{
			for (int col=0; col<=col_max; col++) //Nested For loop for columns
			{
				if ((col == ((3*row))) || (col == col_max - (3*row))) //Here, we will check if get a match then print astrix.
				{
			   		System.out.print("*");
				}
				else
				{
			   		if ((col < col_max - (3*row)) || (col < 3*row)) //In this if-else logic, we will only print till the final astrix for a row else we will space out.
			   		{
						System.out.print("_");
			   		}
			   		else
			   		{
						System.out.print(" ");
			   		}
				}
		      	}
		System.out.println(); //This is required to switch to next line.
		}
	}
}