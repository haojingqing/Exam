package algorithm;


/*
 * 一个数组，有正有负，不改变顺序的情况下，求和最大的最长子序列
 * */


/*
 * 思路：
 * 程序思路也比较简单，从第一位开始累加，当累加和小于零时，设置为零，从下一位开始继续累加，
 * 并记录所有的累加和，取最大。如果最大和为零说明所有数均为负，直接取数组中的最大值做最大和。
 * */
public class ArraySearch2 {

public static void main(String[] args) {

	int[] a= {-1,2,4,1,-1,10};
	searchMaxSequeue(a);
}


     public static void searchMaxSequeue(int[] arr) {
    	 int temp=0;  
    	 int sum=0;
    	 for(int i=0;i<arr.length;i++) {
    		 temp+=arr[i];
    		 if(temp<0) {
    			 temp=0;
    		 }
    		 if(temp>sum) {
    			 sum=temp;
    			 System.out.println("sum:::"+sum+"||"+i);
    		 }
    	 }
    	 
    	 if(sum==0) {
    		 sum=arr[0];
    		 for(int i=0;i<arr.length;i++) {
    			 if(arr[i]>sum) {
    				 sum=arr[i];
    			 }
    		 }
    	 }
    	 System.out.println(sum);
     }
}
