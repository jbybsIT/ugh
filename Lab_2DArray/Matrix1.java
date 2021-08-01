import java.util.*;

public class Matrix1
{
   // variables
   private int m;
   private int n;
   private double data[][];
   // constructors 
   Random rand = new Random();
   // Create m x n matrix and fill it with random floating point numbers
   public Matrix1(int m, int n)
   {
      // create m x n matrix
      data = new double[m][n];
      // Fills in random float numbers
      for (int i = 0; i < m; i++)
      {
         for (int j = 0; j < n; j++)
         {
            data[i][j] = rand.nextInt(20 + 20) + rand.nextFloat();
         }
      }
   }
   // Creates matrix based on the data provided
   public Matrix1(double[][] data)
   {
      m = data.length;
      n = data[0].length;
      this.data = new double[m][n];
      for (int i = 0; i < m; i++)
      {
         for (int j = 0; j < n; j++)
         {
            this.data[i][j] = data[i][j];
         }         
      }        
   }
   // Copy contructor 
   public Matrix1(Matrix1 B)
   {
      this(B.data);
   } 
   // Plus method A + B = C
   public Matrix1 plus(Matrix1 B)
   {  Matrix1 A = this;
      Matrix1 C = new Matrix1(m, n);
      for(int i = 0; i < m; i++)
         for(int j = 0; j < n; j++)
         {
            C.data[i][j] = A.data[i][j] + B.data[i][j];
         }
      return C;
   }
   // Minus method A - B = C
   public Matrix1 minus(Matrix1 B)
   {  
      Matrix1 A = this;
      Matrix1 C = new Matrix1(m, n);
      for(int i = 0; i < m; i++)
         for(int j = 0; j < n; j++)
         {
            C.data[i][j] = A.data[i][j] - B.data[i][j];
         }
      return C;
   }
   // Print Method
   public void print()
   {
      for (int i = 0; i < m; i++)
      {
         for (int j = 0; j < n; j++)
         {
            System.out.printf("%.2f\t\t", data[i][j]);
            
         }
         System.out.println();
      }
   }
   // Main method
   public static void main(String[] args)
   {
      Matrix1 test = new Matrix1(2, 3);
      test.print();
   }
      
   
 }