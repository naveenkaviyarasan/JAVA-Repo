import java.util.*;
class MapExample4{
public static void main(String args[]){
Map<Integer,String> map = new HashMap<Integer,String>();
map.put(100,"Amit");
map.put(101,"Vijay");
map.put(102,"Arun");
map.entrySet()
.stream()
.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
.forEach(System.out::println);
}
}