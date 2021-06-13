package hit.lab2;

public class BigSmallArray {

	public static void main(String[] args) {
		
		int arr[] = {23,56,76,98,109};
		
		int min = arr[0];
		int max = arr[0];
		
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max)
			
				
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		
			
			
		
		}
		
		System.out.println("largest value of an array is "+max);
		
		System.out.println("smallest value of an array is "+min);

	}

}
