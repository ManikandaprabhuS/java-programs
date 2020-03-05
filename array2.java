import java.lang.*;
class array2
{
public static void main(String arg[])
{
String s="a5br3";
int len=s.length();
char[] ch=s.charAt();

StringBuilder sb=new StringBuilder();
for(char c:ch)
{
if(Character.isDigit(c))
{
for(int i=1;i<c;i++)
{

char new=c;
sb.append(new);
}
sb.append(c);
}
else{
System.out.println(" ");
}

}
System.out.println(sb);
}
}