package com.gl.lab3.ques2;

import java.util.HashSet;

public class FindSumPair {
	static public class Node{
		int nodeData;
		Node leftNode, rightNode;
	}
	
	static Node newNode(int nodeData) {
		Node tempNode = new Node();
		tempNode.nodeData=nodeData;
		tempNode.leftNode=null;
		tempNode.rightNode=null;
		return tempNode;
	}
	
	public Node insert(Node root, int key) {
		if(root==null) {
			return newNode(key);
		}
		
		if(key<root.nodeData) {
			root.leftNode=insert(root.leftNode, key);
		}
		else {
			root.rightNode=insert(root.rightNode, key);
		}
		
		return root;
	}
	
	private boolean findpairUtil(Node root, int sum, HashSet<Integer> set) {
		if(root==null)
			return false;
			
		if(findpairUtil(root.leftNode, sum, set))
			return true;
		
		if(set.contains(sum-root.nodeData)) {
			System.out.println("Pair is found ("+(sum-root.nodeData)+","+(root.nodeData)+")");
			return true;
		}
		else {
			set.add(root.nodeData);
		}
		
		return findpairUtil(root.rightNode, sum, set);
	}
	
	public void findpairWithGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<>();
		if(!findpairUtil(root, sum, set)) {
			System.out.println("Pairs do not exit.");
		}
	}

}

