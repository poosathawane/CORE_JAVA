import java.util.*;

class Prog27
{
public static void main(String args[])
{
int large,small,i;
int a[] = new int[]{11, 21,1, 14, 5};
int n = a.length;
large=small=a[0];
for(i=1;i<n;i++)
{
if(a[i]>large)
large=a[i];

if(a[i]<small)
small=a[i];
}

System.out.println("smallest number:" + small );
System.out.println("largest number:"+ large );
}
}