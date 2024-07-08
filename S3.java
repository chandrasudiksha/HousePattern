import java.util.Scanner;
class S3
{
  public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    int n=14;
    int c=(n-1);
     for(int i=0;i<n;i++)
      {
       for(int j=0;j<c;j++)
         System.out.print(" ");
        for(int j=0;j<i;j++)
        if(j==0||j==i-1||i==n-1||i==n/2-1&&(j==2||j==3)||i==n/2&&(j!=1&&j!=3&&j!=i-2)||i==n/2+1&&(j==3||j==4))
          System.out.print("* ");
        else
          System.out.print("  ");
        c--;
        System.out.println();
       }
     for(int i=0;i<n;i++)
      {
        for(int j=0;j<n-2;j++)
        if(j==0||j==n-3||i==n-1||j==1&&i>n/2||j==(n-2)/2&&i>=n/2||i==n/2&&j<(n-2)/2||i==n/2+1&&j>((n-2)/2)+1||i==n-3&&j>((n-2)/2)+1||j==n-((n/2)-1)&&i>(n/2)+1&&i<n-3||j==n-4&&i>(n/2)+1&&i<n-3||j==((n-2)/2)-1&& i==n-4)
          System.out.print(" *");
        else
          System.out.print("  ");
        System.out.println();
       }

     
   }
 }
   