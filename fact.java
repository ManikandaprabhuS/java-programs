import java.util.*;
class fact
{
 public static void main (String args[])
{
int b=1;
int i=1;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
while (i<a)
{
 b=b*i;
 i++;
}
System.out.println(b);
}
}
