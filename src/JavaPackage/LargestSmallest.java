package JavaPackage;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ArrNumbers[] = {1201,1500,-8,-1,-5};
		int Largest = ArrNumbers[0];
		int Smallest = ArrNumbers[0];
		
		for (int i=1; i<ArrNumbers.length; i++)
		{
			if(ArrNumbers[i]>Largest)
			{
				Largest = ArrNumbers[i];
			}
			else if(ArrNumbers[i]<Smallest)
			{
				Smallest = ArrNumbers[i];
			}
		}
		System.out.println("The Number for identification::: 10,-3,34,456,2345");
		System.out.println("The Greatest number is:" +Largest);
		System.out.println("The Smallest number is:" +Smallest);
		
		

	}

}
