import java.util.*;
import java.lang.*;
class mm
{
public static void main(String args[])
 {
   String s=("mani");
   String z=" ";
   String n=" ";
  String c=" ";
   int a=s.length();
   for (int i=a-1;i>=0;i--)
   {
     z=z+s.charAt(i);
     
}
      System.out.println(z);
  
      n=z.substring(1,3).toUpperCase();
     c=n+z.substring(3);

  //z.toUpperCase();
     System.out.println(c);

}
}