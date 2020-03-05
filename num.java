//ip=12345
//op=45312
class num
{
public static void main(String arg[])
{
 int a[]={1,2,3,4,5};
 int b=a.length;
 int c;
 int start=a[0];
 int end=a[4];
 int mid=start+end/2;
   //System.out.println(mid);
   for(int i=0;i<mid;i++)
	{
  		if(a[i]!=mid)
	  {
              int temp=a[i];
	        a[i]=a[i+3];
		a[i+3]=temp;
     }
}
	for(int j=0;j<b;j++)
	{
 	  System.out.print(a[j]);
	}

}
}
