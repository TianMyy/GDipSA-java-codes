//package linear;
//
//public class ReverseLinkList {
//	public void reverse(){
//		if (N == 0){
//		//empty no need reverse
//			return;
//		}
//		reverse(head.next);
//	}
//		
//	public Node reverse(Node curr){
//		if (curr.next==null){
//		//after reverse, head point to the last node
//			head.next=curr;
//			return curr;
//		}
//		Node pre = reverse(curr.next);
//	}
//	
//	pre.next = curr;
//	curr.next=null;
//	return curr;
//	
//	public static void main(String[] args) throws Exception {
//		SingleLinkList<Integer> list = new SingleLinkList<>();
//		list.insert(1);
//		list.insert(2);
//		list.insert(3);
//		list.insert(4);
//		for (Integer i : list) {
//		System.out.print(i+" ");
//		}
//		System.out.println();
//		System.out.println("--------------------");
//		list.reverse();
//		for (Integer i : list) {
//		System.out.print(i+" ");
//		}
//	}
//}


