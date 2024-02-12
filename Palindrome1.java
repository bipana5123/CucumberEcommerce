package A1;

public class Palindrome1 {
	
	
	public static boolean Method1(int array1[])

	{
		int left=0; 
		int right =4;
		
		while(left<=right)
		{
			if(array1[left]!= array1[right] )
			{
				return false;
				
			}
			left=left+1;
			right = right-1;
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		int array1[]= {4,3,2,3,4};
		boolean a = Method1(array1);
		System.out.println(a);
		System.out.println(a);
	}

}
