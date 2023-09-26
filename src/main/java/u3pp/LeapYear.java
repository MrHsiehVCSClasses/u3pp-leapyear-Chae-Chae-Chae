package u3pp;

/** 9/22/23 proj
 * 
 * 
 * @author //Chae Geon Lim at 6300 Honolulu ave house 208 with the password to my garage door being 1127 :)
 *
 */

public class LeapYear {
	/**
	 * leap years are every four years so if the year is greater than or equal to 1852 and is divisible
	 *  by 4 it is a leap year
	 */
	public static boolean isLeapYear(int year) {
		/* YOUR CODE HERE */
		// Set it so that it follows the math it needs to do in proper order so if it is above 1852 and divisible and
		// if it isn't divisible by 100 or divisible by both 100 and 400 it is a leap year
		if (year >= 1852 && year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else 
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}
}