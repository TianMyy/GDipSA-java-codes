package linear;

import java.util.Iterator;

public class SingleLinkList<T> implements Iterable<T> {
	private Node head;
	private int N;
	
	private class Node{
		T item;
		Node next;
		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
	}
	public SingleLinkList() {
		head = new Node(null,null);
		N = 0;
	}
	
	//clear list
	public void clear() {
		head.next = null;
		head.item = null;
		N = 0;
	}
	//is emptey?
	public boolean isEmpty() {
		return N == 0;
	}
	//get the number of elements
	public int length() {
		return N;
	}
	//read and return the value of element which index is i
	public T get(int i) {
		if(i < 0 || i >= N) {
			throw new RuntimeException("Your position is incorrect!");
		}
		Node temp = head.next;
		for(int index = 0; index < i; index++) {
			temp = temp.next;
		}
		return temp.item;
	}
	//add an element
	public void inset(T t) {
		Node temp = head;
		while(temp.next != null) {
			temp =temp.next;
		}
		Node newNode = new Node(t,null);
		temp.next = newNode;
		N++; 
	}
	//insert an element which value is t before element which index is i
	public void insert(int i, T t) {
		if(i < 0 || i >= N) {
			throw new RuntimeException("Your position is incorrect!");
		}
		Node pre = head;
		for(int index = 0; index < i; index++) {
			pre = pre.next;
		}
		Node curr = pre.next;
		
		Node newNode = new Node(t,null);
		pre.next = newNode;
		N++;
	}
	//delete and return the value of element which index is i
	public T remove(int i) {
		if(i < 0 || i >= N) {
			throw new RuntimeException("Your position is incorrect!");
		}
		Node temp = head;
		for(int index = 0; index < i-1; index++) {
			temp = temp.next;
		}
		Node del = temp.next;
		temp.next = del.next;
		N--;
		return del.item;
	}
	//return the index of searching element, if no return -1
	public int indexOf(T t) {
		Node temp = head;
		for(int index = 0; temp.next != null; index++) {
			temp = temp.next.next;
			if(temp.item.equals(t)) {
				return index;
			}
		}
		return -1;
	}
	
	@Override
	public Iterator iterator() {
		return new LIterator();
	}
	private class LIterator implements Iterator<T>{
		private Node temp;
		public LIterator() {
			this.temp = head;
		}
		
		@Override
		public boolean hasNext() {
			return temp.next != null;
		}
		
		@Override
		public T next() {
			temp = temp.next;
			return temp.item;
		}
	}
}

