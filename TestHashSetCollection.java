// HashSet
import java.util.*;
public class TestHashSetCollection {
		public  static void main(String args[]){
	HashSet<String> obj =new HashSet<String>();
	obj.add("Ravi");
	obj.add("Vijay");
	obj.add("");
	obj.add("Raj");
	obj.add("");
	System.out.println(obj);
	//System.out.println(obj.get(2));
	//System.out.println(obj.set(2,"Naveen"));
	System.out.println(obj.contains("Raj"));
	System.out.println(obj.size());
	System.out.println(obj.isEmpty());
        //obj.removeAll(obj);
	System.out.println(obj.isEmpty());

	Iterator<String> itr=obj.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}	
	}
}