package algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 寻找出现最多的数（众数）
 * */
public class ArraySearch3 {

	public static void main(String[] args) {
		
		int[] arr= {12};
		searchMost(arr);
	}
	
	public static int searchMost(int[] arr) {
		if(arr==null) return -1;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])==null) {
				map.put(arr[i], 1);
			}else {
				Integer count = map.get(arr[i]);
				map.put(arr[i], ++count);
			}
		}
		 ArrayList list = new ArrayList<>(map.entrySet());
		 Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((Comparable)((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry)(o1)).getValue());
			}
		});
		 Integer s=map.get(0);
		 System.out.println(list.toString());
		return -1;
	}
}
