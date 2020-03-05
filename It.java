class It
{
   int n;
   String name ="Null";
  It (int a,String c)
   {
	n=a;
	name=c;
  }

 public static void main (String args[])
   {
     It b=new It(143,"Mani");
     System.out.println(b.n +" "+ b.name);
   }
}
