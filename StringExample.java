import java.lang.String;
class StringExample{
public static void main(String args[]){
String value = "Batch 15 is toxic";
String val = "Batch 15 is toxic";
String val1 = "kgm@fs@batch15@thusday";


//contains() check whether the  given value is   available in the given variable along with case sensitive

System.out.println(value.contains("tOxic"));

//concat() is used to add two different string and present it as single string

System.out.println(value.concat(" By birth "));

//equals() check whether the variable and the given string is equal are not it is case sensitive and space concerned 

System.out.println(value.equals("Batch 15 is toxic "));

//equalsIgnoreCase()ignore the case sensitive and check the value the variable, also space concerned 

System.out.println(value.equalsIgnoreCase("BATCH 15 IS TOXIC "));

//toUpperCase() changes all the alphabets to cap

System.out.println("toUpperCase(): " + value.toUpperCase());

//toLowerCase() changes all the alphabets to SMALL

System.out.println("toLowerCase(): " + value.toLowerCase());

//length() return of the variable along with space 

System.out.println("length(): " + value.length());

//charAt() returns the char that has been available in the specifixed index value

System.out.println("charAt(): " + value.charAt(3));

System.out.println("compareToIgnoreCase(): " + value.compareTo(val));

//indexOf()return the index value of specified char

System.out.println("indexOf(): " + value.indexOf('s'));

//isEmpty()is used to check when the given variable is empty or not.

System.out.println("isEmpty(): " + value.isEmpty());

//replace() used to replace the specified world with the specified value.

System.out.println("replace(): " + value.replace("toxic","VedapuDeveloper"));

//substring() is used to get string that has been mentioned

System.out.println("substring(): " + value.substring(8,11));

System.out.println("trim(): " + value.trim());

//lastIndexOf() return the index of last occurence of the given charactor 

System.out.println("lastIndexOf(): " + value.lastIndexOf('i'));

//hashcode() return the key the hash table which holds variables as values

System.out.println("hashCode(): " + value.hashCode());

//format() changes the given in the specified format

System.out.println("format(): " + value.format("%x",5));

//join() is used to set a delimiter and the parameterized values

System.out.println("join(): " + value.join("kavin","Naveen","pavi"));

//replaceAll() 

System.out.println("replaceAll(): " + value.replaceAll("i","y"));

//split()
String[] arr1 = val1.split("@",3);
for(String a1:arr1){
System.out.println("pattern1" + a1);

}
}
}