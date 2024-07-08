import java.util.Scanner;
class S4
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
        for(int j=0;j<2*n;j++)
        if((i==1||j==2*n-1||i==n-1)&& i!=0)
          System.out.print("* ");
       else if(j%2!=0&&i!=0)
          System.out.print("\\ ");
        else if(i%2!=0)
          System.out.print("__");

        else
          System.out.print("  ");
        System.out.println();
       }
     for(int i=0;i<n;i++)
      {
        for(int j=0;j<n-1;j++)
        if(j==0||j==n-2||i==n-1||j==3&&i>n/2||j==(n-6)&&i>=n/2||i==n/2&&j<(n-6)&&j>2||j==n-7&& i==n-4)
          System.out.print("* ");
        else
          System.out.print("  ");
       for(int j=0;j<2*n;j++)
        if(j==2*n-1||i==n-1)
          System.out.print("* ");
        else if(i==3 && j<n-4 && j>3 ||i==3 && j<=2*(n-4) && j>n|| i==n-6&& j<n-4 && j>3||i==n-6 && j<=2*(n-4) && j>n)

          System.out.print("# ");
        else if(i>3 && i<n-5 && j>3 &&j<n-4 ||i>3 && i<n-5 && j>n &&j<=2*(n-4) )

          System.out.print("# ");
        else
          System.out.print("  ");

        System.out.println();
       }

     
   }
 }
   
