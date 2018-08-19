package algorithm;

/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * */
public class ArraySearch {

	
	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5,56,4,6666,3,4};
		int result=searchNumFromArr(arr, arr.length);
	    System.out.println(result);
	}
	
	/*
	 * arr:要查找的数据源
	 * length:数据源长度
	 * */
	public static int searchNumFromArr(int[] arr,int length) {
	   if(arr==null || arr.length==0 || length==0) {
		   return -1;
	   }
	   if(arr.length==1 && length==1) {
		   return arr[0];
	   }
	   int[] resArr=qucikSort(arr, 0, length-1);
	   int middle=(0+resArr.length-1) /2;
	   int val=resArr[middle];  //中位数
	   int count=1;
	   //查看中位数出现的次数
	   for(int i=middle-1;i>0;i--) {
		   if(resArr[i]==resArr[middle]) {
			   count++;
		   }
	   }
	   for(int j=middle+1;j<length;j++) {
		   if(resArr[j]==resArr[middle]) {
			   count++;
		   }
	   }
	   if(count>middle) {
		   return resArr[middle];
	   }
		return -1;
	}
	
	public static int[] qucikSort(int[] arr,int left,int right) {
		if(arr==null || arr.length==0 || left>=right) {
	    	return null;
	    }
		int i=left;
		int j=right;
		int temp=arr[i];
		
	    while(i!=j) {
	    	  while(i<j && arr[j]>=temp) {
	    		  j--;
	    	  }
	    	  if(i<j) {
	    		  arr[i]=arr[j];
	    	  }
	    	  while(i<j && arr[i]<=temp) {
	    		  i++;
	    	  }
	    	  if(i<j) {
	    		  arr[j]=arr[i];
	    	  }
	    }
		arr[i]=temp;
		qucikSort(arr, left, i-1);//左递归
		qucikSort(arr, i+1, right);//右递归
		return arr;
	}
}
