package doublelinked;

import doublylinked.Method;

public class Main {
		public static void main(String[] args) {
			Method list = new Method();
			Node n1 = new Node(3);
			Node n2 = new Node(7);
			Node n3 = new Node(4);
			Node n4 = new Node(1);
			Node n5 = new Node(2);
			Node n6 = new Node(8);
			Node n7 = new Node(9);
			
			list.systemOut(n1);
			list.systemOut(n2);
			list.systemOut(n3);
			list.systemOut(n4);
			list.systemOut(n5);
			list.systemOut(n6);
			list.systemOut(n7);
			
			list.insertionSort();
			list.print();
		}
	}