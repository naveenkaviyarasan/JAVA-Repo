import java.io.*;
public class CreateDirectory {
public static void main(String args[]){
String dir = "C:\\Users\\Naveen\\Desktop\\KGISL\\KGM\\JAVA-Repo\\learn";
File f  = new File(dir);
f.mkdirs();
}
}