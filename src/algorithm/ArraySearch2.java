package algorithm;


/*
 * һ�����飬�����и������ı�˳�������£���������������
 * */


/*
 * ˼·��
 * ����˼·Ҳ�Ƚϼ򵥣��ӵ�һλ��ʼ�ۼӣ����ۼӺ�С����ʱ������Ϊ�㣬����һλ��ʼ�����ۼӣ�
 * ����¼���е��ۼӺͣ�ȡ����������Ϊ��˵����������Ϊ����ֱ��ȡ�����е����ֵ�����͡�
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
