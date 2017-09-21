package technical;
import java.util.List;

public class SeparateGroups {
	public boolean separate(List<Integer> list, int k){
		int arr[]=new int[list.size()];
		for(int i=0; i<list.size();i++){
			arr[i]= list.get(i);
		}
		int n=arr.length;
		if(k==1)
			return true;
		if(n<k)
			return false;
		if(n%k!=0)
			return false;
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		if(sum%k!=0)
		return false;
		int subset=sum/k;
		int subsetsum[] = new int[k];
		boolean taken[]=new boolean[n];
		
		for(int i=0;i<k;i++){
			subsetsum[i]=0;
		}
		for(int i=0;i<n;i++){
			taken[i]=false;
		}
		subsetsum[0]=arr[n-1];
		taken[n-1]=true;
		return isKpartitionPossibleRec(arr, subsetsum, taken, subset, k, n,0, n-1);
}
	public boolean isKpartitionPossibleRec(int arr[], int subsetSum[], boolean taken[], int subset, int k, int n, int curIdx, int limitidx){
		if(subsetSum[curIdx]==subset){
			if(curIdx==k-2)
			return true;
		return isKpartitionPossibleRec(arr, subsetSum, taken, subset, k, n, curIdx+1, n-1);
		}
			for(int i=limitidx;i>=0;i--){
				if(taken[i])
					continue;
				int tmp=subsetSum[curIdx]+arr[i];
				if(tmp<=subset)
				{
					taken[i]=true;
					subsetSum[curIdx]+=arr[i];
					boolean next=isKpartitionPossibleRec(arr, subsetSum, taken, subset, k, n, curIdx, i-1);
					
					taken[i]=false;
					subsetSum[curIdx]-=arr[i];
					if(next)
						return true;
				}
			}
			return false;
		}
			
	
	
	
	
}
