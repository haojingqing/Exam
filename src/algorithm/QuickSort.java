package algorithm;
 
/*
 * øÏÀŸ≈≈–Ú       ±º‰∏¥‘”∂»   nlogn
 * */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {8,6,22,3,1,88,10};
		int[] sortArr=quickSort(arr,0,arr.length-1);
		for(int i=0;i<sortArr.length;i++) {
			System.out.println(sortArr[i]);
		}
	}
	
   
	public static int[] quickSort(int a[],int left,int right)
	{
		int i=left;
		int j=right;
		int temp=a[left];
		
		if(left>=right) {
			return null;
		}
		while(i!=j) {
			while(i<j && a[j]>=temp) {
				j--;
			}
			if(j>i) {
				a[i]=a[j];
			}
			while(i<j && a[i]<=temp) {
				i++;
			}
			if(i<j) {
				a[j]=a[i];
			}
			
		}
		a[i]=temp;
		quickSort(a, left, i-1); //µ›πÈ◊Û±ﬂ
		quickSort(a, i+1, right); //µ›πÈ”“±ﬂ
		
		return a;
	}
	   
}
