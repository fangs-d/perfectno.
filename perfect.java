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