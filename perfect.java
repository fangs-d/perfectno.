//Author  : Deepansh Dubey.
//Date      : 10/10/2020.
//Purpose: Check Perfect no.


import java.io.*;
class perfect
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,i,c=0;
System.out.println("Input a numbers");
a=Integer.parseInt(br.readLine());
for(i=1;i<a;i++)
{
if(a%i==0)
{
c=c+i;
}
}
if(c==a)
{
System.out.println(a+" is a perfect number");
}
else
{
System.out.println(a+" is not a perfect number");
}
}}
import java.io.*;
class monuments
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int i,j,n,m,k=0,l=0,p, size;
        System.out.println("Input Row x Column");
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        size = n*m;

        int[][] arr = new int[m][n];
        int[] brr = new int[200];

        for(i=0;i<m;++i)
        {
            for(j=0;j<n;++j)
            {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        //LOGIC
         System.out.println("--------------------------------");
         for(i=0;i<n;++i)
        {
            for(j=0;j<m;++j)
            {   
                k = 0; p = m;
                if(i%2==0)
                    // System.out.println();
                    brr[l++] = arr[k++][i];
                if(i%2!=0)
                    brr[l++] = arr[p--][i];
                System.out.println(arr[i][j]);
            }
        }

        for(i=0;i<size+1;++i)
        {
            System.out.print("\n--------------------------------" + brr[i]);
        }
    }
}
