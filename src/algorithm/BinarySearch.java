package algorithm;

/*
 * 二分查找：给定有序数组，通过二叉查找找出指定key,查到index，否则返回-1     时间复杂度：logn
 * */
public class BinarySearch {

	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,8};
		//int result=binarySearch(arr, -10);
		int result=recursivebinarySearch(arr, 0, arr.length-1, 2);
		System.out.println(result);
	}
	
	
	public static int testBinary(int[] arr,int key) {
		if(arr==null || arr.length==0 || key<0)
			return -1;
		int left=0;
		int right=arr.length-1;
		int middle=0;
		while(left<=right) {
			middle=(left + right ) / 2;
			if(arr[middle]==key) {
				return middle;
			}else if(arr[middle]<key) {
				left=middle+1;
			}else {
				right=middle-1;
			}
		}
		return -1;
	}
	
	
	
	public static int binarySearch(int[] arr,int key) {
		
		if(arr==null || arr.length==0) {
			return -1;
		}
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
		 int middle=(left + right) / 2;
		if(key==arr[middle]) {
			return middle;
		}else if(key<arr[middle]) {
			right=middle-1;
		}else {
			left=middle+1;
		}
			
		}
		return -1;
	}
	
	
	 public static int recursivebinarySearch(int num[], int start, int end, int key) {  
	        int mid = (start + end) / 2;  
	        if (num == null || num.length == 0 || key < num[start] || key > num[end]) {  
	            return -1;  
	        } else if (num[mid] > key) {  
	            return recursivebinarySearch(num, start, mid - 1, key);  
	        } else if (num[mid] < key) {  
	            return recursivebinarySearch(num, mid + 1, end, key);  
	        } else {  
	            return mid;  
	        }  
	  
	    }  
	
}
