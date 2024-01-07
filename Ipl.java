package assg2;

import java.util.Arrays;

public class Ipl {

	public int countOfTeams(int[] arr, int k) {
		int sum=0;
		int min=0;
		int max=Arrays.stream(arr).sum();
		int mid;
		
		while(min<=max)
		{
			mid=(min+max)/2; //assume 5 teams 
			if(checkTeamsArePossible(arr,mid,k))//Yes 5 teams are poss
			{
				if(!checkTeamsArePossible(arr,mid+1,k)) // 6 teams are  not poss
				{
					return mid;
				}
				else
				{
					min=mid+1;
				}
			}
			else
			{
				max=mid-1;
			}
		}
		return 0;
	}
		// {3,5,7,6};								 //  5         4
	private boolean checkTeamsArePossible(int[] arr, int not, int nop) {
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum+=Math.min(arr[i],not);//sum=0,3,8,13,18
	}
	if(sum>=not*nop)
		return true;
	else
		return false;
	}

}
