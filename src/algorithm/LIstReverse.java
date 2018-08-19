package algorithm;

/*
 * 链表反转
 * */
public class LIstReverse {

	public static void main(String[] args) {
	/*	Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(null);
		System.out.println("begin");
		Node reverseNode= reverseList(node1);
		System.out.println(reverseNode);
		System.out.println(reverseNode.getData()+","+reverseNode.getNext().getData());*/
		int arr[] = {1,2,3,4,5};
		Node node=createNodeList(arr);
        reverseList(node);
	}
	
	/*
	 * 创建单链表
	 * */
	public static Node createNodeList(int[] arr) {
		Node head=null;
		Node tempNode=null;
		if(arr==null || arr.length==0) {
			return null;
		}
		for(int i=0;i<arr.length;i++) {
		    Node node = new Node(arr[i]);
			if(head==null) {
			head=node;
			tempNode=node;
		    }else {
		     tempNode.next=node;
		     tempNode=node;
		    }
		}
		
		return head;
	}
	
	
	//反转单链表
	public static Node reverseList(Node head) {
		if(head==null) {
			return null;
		}
		Node reverseNode=null;
		Node pre=head;
		Node curNode=pre.getNext();
		Node tempNode;
		while(curNode!=null) {
		tempNode=curNode.getNext();
		   curNode.setNext(pre);
		   pre=curNode;
		   curNode=tempNode;
		}
		head.setNext(null);
		return pre;
}
}



class Node{
	public int data;
    public Node next;
	public Node(int data) {
      this.data=data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
