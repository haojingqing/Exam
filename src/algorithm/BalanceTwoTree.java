package algorithm;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 由一数组建平衡二叉树 并查找       待看....
 * */
public class BalanceTwoTree {
       private static class Node
       {
		public int s;
		public Node left = null;
		public Node right = null;
		}
		public static Node CreateTree(int[] a,int left,int right)
		{ 
		if(left>right)
		        return null;
		        Node node = new Node();
		
		
		        node.s = a[(left+right)/2];
		node.left = CreateTree(a,left,(left+right)/2-1);
		node.right = CreateTree(a,(left+right)/2+1,right );
		return node;
		}
		public static void ShowTree(Node node)
		{
		if(node == null)
		return;
		System.out.print("[");
		
		ShowTree(node.left);
		System.out.print(node.s);
		ShowTree(node.right);
		System.out.print("]");
		}
		
		public static Node FindNode(Node node,int key)
		{
		while(node!=null)
		{
		if(node.s == key)
		{
		System.out.println("find success!");
		return node;
		}
		else if(node.s>key)
		{
		node = node.left;
		}
		else if(node.s<key)
		{
		node = node.right;
		}
		}
		return null;
		}
		public static void main(String[] args){
		   
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)
		a[i] = sc.nextInt();
		Arrays.sort(a);
		Node node = CreateTree(a,0,a.length-1);
		ShowTree(node);
		System.out.println("");
		System.out.println("please input key");
		FindNode(node,sc.nextInt());
		
		
		}
		
		
		}
