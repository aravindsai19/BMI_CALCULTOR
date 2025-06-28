import java.util.*;

class BMI_CALCULATOR
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter u height ");
		float height = s.nextFloat();
		
		System.out.println("enter the weight");
		float weight = s.nextFloat();

		// Correct BMI formula
		double result = weight / (height * height);

		if (result < 18.5)
		{
			System.out.println("the BMI% of your body is " + result + " and considered as under weight");
		}
		else if ((result >= 18.5) && (result <= 24.9))
		{
			System.out.println("the BMI% of your body is " + result + " and considered as normal weight ");
		}
		else if ((result >= 25.0) && (result <= 29.9))
		{
			System.out.println("the BMI% of your body is " + result + " and considered as OVER weight ");
		}		
		else
		{
			System.out.println("the BMI% of your body is " + result + " and considered as OBESCITY");
		}
		s.close();
	}
}
