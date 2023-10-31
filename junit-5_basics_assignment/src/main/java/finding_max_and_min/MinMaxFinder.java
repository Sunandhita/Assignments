package finding_max_and_min;

//Question 1

public class MinMaxFinder 
{
	public int[] findMinMax(int arr[])
	{
		int arr1[]=new int[2];
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
		arr1[0]=min;
		arr1[1]=max;
		return arr1;
	}

}
