package exercise;

import java.util.LinkedList;
/*
 * 1) Given two singly linked lists that intersect at some point, 
 * find the intersecting node. Assume the lists are non-cyclical.

For example, given A = 3 ➔ 7 ➔ 8 ➔ 10 and B = 99 ➔ 1 ➔ 8 ➔ 10, 
return the node with value 8. In this example, assume nodes with 
the same value are the exact same node objects.

Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.
 */
public class IntersectingLinkedLists {

	public static Object intersectingLists(LinkedList<Object> linked1, LinkedList<Object> linked2) {
		Object res = null;
		for(Object x: linked1) {
			for(Object y: linked2) {
				if(x.equals(y)) {
					res = x;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		LinkedList<Object> one = new LinkedList<Object>();
		LinkedList<Object> two = new LinkedList<Object>();
		
		one.add(1);
		one.add(2);
		one.add(3);
		
		two.add(5);
		two.add(2);
		two.add(7);
		
		System.out.println(intersectingLists(one, two));

	}

}
