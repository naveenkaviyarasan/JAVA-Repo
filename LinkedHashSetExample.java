import java.util.*;
class LinkedHashSetExample{
	public static void main(String args[]){
		LinkedHashSet<String> v = new LinkedHashSet<String>();
		v.add("Naveen");
		v.add("Ram");
                v.add(" ");
		v.add("Jai");
		v.add("Raj");
		v.add("Yogi");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
