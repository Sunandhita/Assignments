package finding_max_and_min_object;

//Question 2

public class ModifiedMinMaxFinder 
{
	int minimum;
	int maximum;
	
	public static ModifiedMinMax ModifiedFindMinMax(int arr[])
	{
		int min=arr[0],max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(max<arr[i])
				max=arr[i];
		}
		return new ModifiedMinMax(min,max);
	}
}

