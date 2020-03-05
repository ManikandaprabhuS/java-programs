class rev
{
public static void main(String args[])
{
  String c=" ";
  String n=" ";
  String z=" ";
  String s1="imissyou";
  String[] x=s1.split("\\s");
 for(String w:x)
  System.out.println(w);
  int a=s1.length();
  for (int i=a-1;i>=0;i--)
    {

      z=z+s1.charAt(i);
     }
    n=z.substring(1,8).toUpperCase;
    c=n+z.substring(8);
    System.out.println(c);
  
}
}





