package algorithm;

public class ListNodeAdd {

	public static void main(String[] args) {
		int[] a= {2,5,5,6,7,8};
		int[] b= {9,9,1};
		ListNode alist=buildListNode(a);
		ListNode blist=buildListNode(b);
		
		//ListNode addNode = addNode(alist, blist);
		//while(addNode!=null) {
		//	System.out.println(addNode.val);
		//	addNode=addNode.nextNode;
		//}
	/*	ListNode lists =removeLastKthNode(alist, 5);
		while(lists!=null) {
			System.out.println("result:"+lists.val);
			lists=lists.nextNode;
		}*/
	}
	
	
	public static ListNode add(ListNode list1,ListNode list2) {
		ListNode first=null,last=null,tempNode=null;
		int val;
		int carry=0;
	    while(list1!=null || list2!=null) {
	    	val=((list1==null?0:list1.val) + (list2==null?0:list2.val) +carry) % 10;
	        carry=((list1==null?0:list1.val) + (list2==null?0:list2.val) + carry) / 10;
	        tempNode=new ListNode(val);
	        if(first==null) {
	        	first=tempNode;
	        	last=tempNode;
	        }else {
	        	last.nextNode=tempNode;
	        	last=tempNode;
	        }
	        list1=list1==null?null:list1.nextNode;
	        list2=list2==null?null:list2.nextNode;
	    }
	    if(carry>0) {
	    	ListNode carryNode = new ListNode(carry);
	    	last.nextNode=carryNode;
	    	last=carryNode;
	    }
	    return first;
	}
	
	
	public static ListNode addNode(ListNode list1,ListNode list2) {
		ListNode first=null;
		ListNode last=null;
		ListNode newNode;
		int val;
		int carry=0;
		while(list1!=null && list2!=null) {
			val=((list1==null?0:list1.val)+(list2==null?0:list2.val)+carry) %10;
		    carry=((list1==null?0:list1.val)+(list2==null?0:list2.val)+carry) /10;
		    list1=list1==null?null:list1.nextNode;
		    list2=list2==null?null:list2.nextNode;
		    newNode=new ListNode(val);
		    if(first==null) {
		    	first=newNode;
		    	last=newNode;
		    }else {
		    	last.nextNode=newNode;
		    	last=newNode;
		    }
		}
		if(carry>0) {
			newNode=new ListNode(carry);
			last.nextNode=newNode;
			last=newNode;
		}
		return first;
	}
	
	
	
	 public static ListNode buildListNode(int [] list){
	        ListNode first=null,last=null,newNode;
	        for(int i=0;i<list.length;i++){
	            newNode=new ListNode(list[i]);
	            if(first==null){
	                first=newNode;
	                last=newNode;
	            }else{
	                last.nextNode=newNode;
	                last=newNode;
	            }
	        }
	        return first;
	    }
	
	 
	 // 2.在单链表中删除倒数第k个节点(方法一)
	    public static ListNode removeLastKthNode(ListNode head, int k) {
	        if (k <= 0 || head == null)
	            return head;
	        ListNode p = head;
	        for (int i = 0; i < k; i++) {
	            if (p.nextNode != null) {
	                p = p.nextNode;
	            }
	            else
	                return head;
	        }
	        ListNode q = head;
	        while (p.nextNode != null) {
	            p = p.nextNode;
	            q = q.nextNode;
	        }
	        q.nextNode = q.nextNode.nextNode;
	        return head;
	    }
	 
}





class ListNode{
	
	int val;
	ListNode nextNode;
	
	public ListNode(int val) {
		this.val=val;
	}
}

