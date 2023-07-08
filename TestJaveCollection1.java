import java.util.*;

class TestJaveCollection1{
public static void main(String args[]){
ArrayList<String>list = new ArrayList<String>();
list.add("Naveen");
list.add("Vijay");
list.add("Raj");
list.add("Ram");
Iterator itr = list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}


