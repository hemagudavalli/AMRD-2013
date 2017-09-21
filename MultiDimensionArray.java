package technical;


public class MultiDimensionArray {
	
	int[][] multiArr;
	
	public int[][] getMultiArr() {
		return multiArr;
	}
	public void setMultiArr(int[][] multiArr) {
		this.multiArr = multiArr;
	}
	
	public static Long sum(MultiDimensionArray mArray, int[] lengthOfDimension){
		int[][] arr = mArray.getMultiArr();
		Long sum = 0L;
		for(int row =0;row<arr.length;row++){
			for(int column=0; column<arr[row].length;column++){
				sum = sum+arr[row][column];
			}
		}
		System.out.println(sum);
		System.out.println(lengthOfDimension[0]);
		return sum;
		
			
		}
}
