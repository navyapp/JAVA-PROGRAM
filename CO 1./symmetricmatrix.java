import java.util.Scanner;

class symmetricmatrix
{

 public static void main(String args[])
 {

   Scanner sc=new Scanner(System.in);

   System.out.println("enter the rows");
 
   int rows=sc.nextInt();

   System.out.println("enter the columes");

   int columes=sc.nextInt();

   int matrix[][]=new int[rows][columes];
 
   System.out.println("enter the elements");

   for(int i=0;i<rows;i++)
   {

    for(int j=0;j<columes;j++)
    {

      matrix[i][j]=sc.nextInt();

    }

   }
 
   System.out.println("enter the matrix");

   for(int i=0;i<rows;i++)
   {

   for(int j=0;j<columes;j++)
   {

    System.out.print(matrix[i][j] + "\t");

   }

   System.out.println();

  }
  if(rows!=columes)
  {

    System.out.println("the matrix in note a square matrix");

  }
  else
  {
    boolean symmetric=true;
 
   for( int i=0;i<rows;i++)
   {
    for(int j=0;j<columes;j++)
    {

      if(matrix[i][j]!=matrix[j][i])
      {
        symmetric=false;
        break;
      }

     }
   }

    if(symmetric)
    {

      System.out.println("the given matrix is symmetric");
      

    }
    
    else
    {
    
    System.out.println("the given matrix is not a symmetric");
    
    }

  
  }
  sc.close();

 }

}   