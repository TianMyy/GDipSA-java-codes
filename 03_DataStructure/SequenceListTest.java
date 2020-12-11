package linear;

import java.util.Iterator;

public class SequenceListTest{
	public static void main(String[] args) {
		SequenceList<String> s1 = new SequenceList<>(10);
		//test insert
		s1.insert("James");
		s1.insert("Bobbi");
		s1.insert("Peter");
		s1.insert(1,"David");
		//test get
		String getResult = s1.get(1);
		System.out.println("Value of index 1 is: "+getResult);
		//test delete
		String removeResult = s1.remove(0);
		System.out.println("Element deleted is: "+removeResult);
		//test clear
		s1.clear();
		System.out.println("The number of element after clearing is: "+s1.length());
		System.out.println("-------------------------");
		
		SequenceList<String> s2 = new SequenceList<>(5);
		s2.insert(0, "Mary");
		s2.insert(1, "Nancy");
		s2.insert(2, "Jennie");
		s2.insert(3, "Chloe");
		s2.insert(4, "Lisa");
		
		System.out.println("Sequence list 2:");
		for(String s : s2) {
			System.out.println(s);
		}
		
		/*
		//System.out.println("-------------------------");
		//test loop
		squence.insert(0, "姚明");
		squence.insert(1, "科比");
		squence.insert(2, "麦迪");
		squence.insert(3, "艾佛森");
		squence.insert(4, "卡特");
		System.out.println(squence.capacity());
		squence.insert(5,"aa");
		System.out.println(squence.capacity());
		squence.insert(5,"aa");
		squence.insert(5,"aa");
		squence.insert(5,"aa");
		squence.insert(5,"aa");
		squence.insert(5,"aa");
		System.out.println(squence.capacity());
		squence.remove(1);
		squence.remove(1);
		squence.remove(1);
		squence.remove(1);
		squence.remove(1);
		squence.remove(1);
		squence.remove(1);
		System.out.println(squence.capacity()
		*/
	}
}

class SequenceList<T> implements Iterable<T>{
	private T[] data;
	private int N;

	public SequenceList(int capacity) {
		data = (T[])new Object[capacity];
		N = 0;
	}
	//clear the sequence list
	public void clear() {
		N = 0;
	}
	//determine whether the linear table is empty
	public boolean isEmplty() {
		return N == 0;
	}
	//get the length
	public int length() {
		return N;
	}
	//read and return the value of element which index is i
	public T get(int i) {
		if(i < 0 && i >= N) {
			throw new RuntimeException("No elements exist!");
		}
		return data[i];
	}
	//insert a element with value T before the element which index is i
	public void insert(int i, T t) {
		if(i == data.length) {
			throw new RuntimeException("The table is fullfilled!");
		}
		if(i < 0 || i >= N) {
			throw new RuntimeException("Position is incorrect!");
		}
		//make the index i empty, all original elements move backward for 1 index
		for(int index = N; index > i; index--) {
			data[index] = data[index - 1];
		}
		data[i] = t;
		N++;
	}
	//add an element
	public void insert(T t) {
		if(N == data.length) {
			throw new RuntimeException("The table is fullfilled!");
		}
		data[N++] = t;
	}
	//delete an element which index is i and return its value
	public T remove(int i) {
		if(i < 0 || i >= N) {
			throw new RuntimeException("Position is incorrect!");
		}
		T result = data[i];
		for(int index = i; index < N-1; index++) {
			data[index] = data[index + 1];
		}
		N--;
		return result;
	}
	//return the index it appear first, if no such element, return -1
	public int indexOf(T t) {
		if(t == null) {
			throw new RuntimeException("Your element is incorrecr!");
		}
		for(int i = 0; i < N; i++) {
			if(data[i].equals(t)) {
				return i;
			}
		}
		return -1;
	}
	
	public void showEles(){
		for (int i = 0; i < N; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	/*
	//change the capacity
	private void resize(int newSize){
		//record the old array
		T[] temp = data;
		//create an new array
		data = (T[]) new Object[newSize];
		//copy elements in old array to the new array
		for (int i = 0; i < N; i++) {
			data[i] = temp[i];
		}
	}
	public int capacity(){
		return data.length;
	}
	*/
	
	@Override
	public Iterator<T> iterator() {
		return new SIterator();
	}
	
	private class SIterator implements Iterator{
        private int cusor;
        public SIterator(){
            this.cusor=0;
        }
        @Override
        public boolean hasNext() {
            return cusor<N;
        }

        @Override
        public Object next() {
            return data[cusor++];
        }
    }
}

