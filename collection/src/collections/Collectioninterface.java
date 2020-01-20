package collections;
import java.util.*;
public class Collectioninterface {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>e=new ArrayList<>();
e.add("a");
e.add("b");
e.add("c");
System.out.println(e);
ArrayList<String> e1=new ArrayList<>();
e1.add("e");
e1.add("f");
e1.add("g");
e.addAll(e1);
System.out.println(e);
e.removeAll(e1);
System.out.println(e);
e.remove("a");
System.out.println(e);
System.out.println(e.retainAll(e1));

	}

}
