package algorithm;

/*
 * 寻找字符串中的回文串
 * */
public class Search2T2String {
    
	
	public static void main(String[] args) {
		String s="goxxoglexxx";
		//boolean flag=searchStr(s);
		//System.out.println(flag);
		searchAll(s);
	}
	
	public static void searchAll(String s) {
		if(s==null || s.length()==0) {
			return ;
		}
		int left=0;
		int right=s.length()-1;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				String test=s.substring(i, j);
				searchStr(test);
			}
		}
	}
	
	public static boolean searchStr(String s) {
		  if(s==null || s.length()<=1) {
			  return false;
		  }
	
		
		StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s);
        StringBuffer sb=stringBuffer.reverse();
	
       for(int i=0;i<s.length();i++) {
    	   if(s.charAt(i)!=sb.charAt(i)) {
    		   return false;
    	   }
       }
        System.out.println(s);
		return true;
	}
}
