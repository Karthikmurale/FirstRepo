package JavaPackage;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[] =  {12345};
		
		int len = number.length;
		int Rev = 0;
		
		for(int i=0; i<len; i++)
		{
			for (int j=len; j>len; j--)
			{
				number[i]=number[j];
				Rev = number[i];
				
			}
		}
		
		System.out.println("The Reverse Number is:" +Rev);
	}

}
