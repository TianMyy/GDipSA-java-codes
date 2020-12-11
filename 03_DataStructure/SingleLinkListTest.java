package linear;

public class SingleLinkListTest {
	public static void main(String[] args) throws Exception {
		SingleLinkList<String> list = new SingleLinkList<>();
		list.insert(0,"Tony");
		list.insert(1,"Bobbi");
		list.insert(2,"Peter");
		list.insert(3,"David");
		//test length()
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println(list.length());
		System.out.println("-------------------");
		//test get()
		System.out.println(list.get(2));
		System.out.println("------------------------");
		//test remove()
		String remove = list.remove(1);
		System.out.println(remove);
		System.out.println(list.length());
		System.out.println("----------------");;
		for (String s : list) {
			System.out.println(s);
		}
	}
}
