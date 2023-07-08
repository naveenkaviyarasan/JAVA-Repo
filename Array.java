import java.util.Array;
class Array{
public static void main(String args[]){
int temp;
int a =new int[]{59,78,32,11,23,56,2345,98};
System.out.println("enter num :"+Array.toString(a));
for(int i=0;i<a.length;i++){
for(int j=1;i<a.length;j++){
if(a[i]<a[j]);
{
temp = a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
}
}                                                                                                                                           