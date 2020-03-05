class array
{
public static void main(String arg[])
{
String s="a5b3";
int a=s.length();
char n;
for (int i=0;i<a;i++)
{
char b=s.charAt(i);
Boolean f=Character.isDigit(b);
System.out.println(f);
if(f==true)
{
  for(int j=b;j>0;j--)
{
 System.out.printf(n);
}
}
else
{
char n=b;
System.out.printf(b);
}
}
}
}