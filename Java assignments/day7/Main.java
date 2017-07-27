/*Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface. 
Each Link object in the list should contain a reference to the next element in the list, but not the previous one (LinkedList,
in contrast, is a doubly linked list, which means it maintains links in both directions). Create your own SListIterator which,
again for simplicity, does not implement ListIterator. The only method in SList other than toString( ) should be iterator( ),
which produces an SListIterator. The only way to insert and remove elements from an SList is through SListIterator.
Write code to demonstrate SList.*/
package Slist;
import java.util.*;

class SList<T>{
/*This is the starting point of the linked list which is initiated as null.
*/
	public Link<T> head = new Link<T>(null);
	
	public String toString() { 
		if(head.next == null) return "Linked List: []";

/*		it is the custom iterator pointer which is the only way to insert and remove elements from an SList.
*/
		SListIterator<T> it = this.iterator();

		StringBuilder s = new StringBuilder();

		/*if  the current pointer of the linked list has next element, it will append the stringbuilder s.*/

		while(it.hasNext()) {
			s.append(it.next() + (it.hasNext() ? ", " : ""));
		}
		return "SList: [" + s + "]";
	}

	/*returns custom iterator from the current node */

	SListIterator<T> iterator(){
		return new SListIterator<T>(head);
	}		
}

/*custom iterator which has methods to check whether current node has the next element or not,
 or return next element, or insert element, or remove the element*/

class SListIterator<T> {
	Link<T> curr;
	SListIterator(Link<T> link) {
		curr = link;
	}
	public boolean hasNext() {
		return curr.next != null;
	}
	public Link<T> next() {
		curr = curr.next;
		return curr;
	}
	public void insert(T e) {
		curr.next = new Link<T>(e, curr.next);
		curr = curr.next;
	}	
	public void remove() {
		if(curr.next != null) {
			curr.next = curr.next.next;
		}
	}
}

/*
Link object acts like a node for the linked list. If the next element is specified, it would create object having the next element
 otherwise it would create null object as the next one.*/

class Link<T> {
	T current;
	Link<T> next;
	
	Link(T current) {
		this(current, null);
	}

	Link(T current, Link<T> next) { 
		this.current = current;
		this.next = next; 
	}

	public String toString() {
		if(current == null) return "Empty";
		return current.toString();
	}
}

public class Main {

	public static void main(String[] args) {

		SList<String> linkedlist = new SList<String>();
		SListIterator<String> node= linkedlist.iterator();
		node.insert("hi");
		System.out.println("Inserting hi - "+linkedlist);
		node.insert("fi");
		System.out.println("Inserting fi - "+linkedlist);
		node.insert("ri");
		System.out.println("Inserting ri - "+linkedlist);
		node.insert("ti");
		System.out.println("Inserting ti - "+linkedlist);
		linkedlist.iterator().remove();
		System.out.println("Removing hi - "+linkedlist);
		linkedlist.iterator().remove();
		System.out.println("Removing fi - "+linkedlist);
	}
}