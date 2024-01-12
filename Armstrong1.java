import java.util.Scanner;
class Armstrong{
public static void main(String[]args){
Scanner fr=new Scanner(System.in);
System.out.println("Enter your number");
int a=fr.nextInt();
int a1=a;
int a2=a1;
int count=0;
int mod=0;
int sum=0;
while(a1>0)
{
count++;
a1=a1/10;
}
while (a2>0)
{
int mul=1;
int rem=a2%10;
for(int i=1;i<=count;i++)
{
mul=mul*rem;
}
sum=sum+mul;
a2=a2/10;
}
if(sum==a)
{
System.out.println("its an armstrong number");
}
else
{
System.out.println("its not an armstrong number");
}
}
}