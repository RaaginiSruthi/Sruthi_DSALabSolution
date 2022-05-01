package org.gl.lab3DSA;

import java.util.HashSet;

public class BinarySearchSumPair {

	// driver method
	public static void main(String args[]) {

		HashSet<Integer> set = new HashSet<Integer>();

		Node root = new Node(40);
		root.left = new Node(20);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(30);;
		root.right.left = new Node(50);
		root.right.right = new Node(70);

		int sum = 90;
		boolean binarySearch = traverseInorder(root, sum, set);

		if (binarySearch == false) {
			System.out.println("Pair doesnot exist");
		}
	}
	

	static class Node {
		int data;
		Node left, right; // Node is user defined data type

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	
	static boolean traverseInorder(Node node, int sum, HashSet<Integer> set) {

		if (node == null) {
			return false;
		}

		if (traverseInorder(node.left, sum, set)) {
			return true;
		}

		if (set.contains(sum - node.data)) {
			System.out.println("Pair is found (" + (sum - node.data) + "," + node.data + ")");
			return true;
		} else {
			set.add(node.data);
		}

		set.add(node.data);

		System.out.println(node.data + "");

		if (traverseInorder(node.right, sum, set)) {
			return true;
		}

		return false;
	}

}
