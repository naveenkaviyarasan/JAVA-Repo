import java.util.*;
class CollectionExample1{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Naveen");
		list.add("Ram");
		list.add("Vijay");
		list.add("Siva");
		list.add("Mani");
		//list.remove("Naveen");
		list.remove(3);
		//Collection.removeAll(list);
		//list.clear();
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}		
	}
}


OUT PUT:
----------

C:\Users\Naveen\Desktop\KGISL\KGM\JAVA-Repo>javac CollectionExample1.java

C:\Users\Naveen\Desktop\KGISL\KGM\JAVA-Repo>java CollectionExample1
Naveen
Ram
Vijay
Mani