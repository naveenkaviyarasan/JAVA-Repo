import java.util.*;
class CollectionExample2{
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<String>();
		list.add("Naveen");
		list.add("Raj");
		list.add("Mani");
		list.add("Vijay");
		list.add("Arun");
		list.remove(4);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}


OUTPUT:
--------
C:\Users\Naveen\Desktop\KGISL\KGM\JAVA-Repo>javac CollectionExample2.java

C:\Users\Naveen\Desktop\KGISL\KGM\JAVA-Repo>java CollectionExample2
Naveen
Raj
Mani
Vijay