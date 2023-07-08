import java.util.*;
class HashSetExample{
	public static void main(String args[]){
		HashSet<String> v = new HashSet<String>();
		v.add("Naveen");
		v.add(" ");
		v.add("Ram");
		v.add("Kumar");
		v.add("Jai");
		v.add("Arun");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}


OUTPUT:
---------
C:\Users\Naveen\Desktop\KGISL\KGM\JAVA-Repo>javac HashSetExample.java

C:\Users\Naveen\Desktop\KGISL\KGM\JAVA-Repo>java HashSetExample

Naveen
Kumar
Jai
Arun
Ram