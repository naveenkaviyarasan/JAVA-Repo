import java.io.*;
public class text1{
public static void main(String args[]){

DataInputStream d = new DataInputStream(new
 FileInputStream(""));
 DataOutputStream out = new DataOutputStream(new
 FileOutputStream("")); 

String count;
 while((count = d.readLine()) != null){
 String u = count.toUpperCase();
 System.out.println(u);
 out.writeBytes(u + " ,");
 }
 d.close();
 out.close();
}