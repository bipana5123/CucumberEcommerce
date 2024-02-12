package A1;

public class BubbleSortq {
	public static void Method1(int array[])
	{
		for(int i =0; i<=array.length-1;i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
	public static void Method2(int array[])
	{
		for(int i=0; i<=array.length-1;i++)
		{
			for(int j=0;j<=array.length-1-1; j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int array[]= {2,1,4,3};
		Method1(array);
		Method2(array);
		Method1(array);

		Method2(array);
		Method2(array);
		
		
		
		
	}

}
