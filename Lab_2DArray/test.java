import java.util.Random;

public class test
{
   public static void main(String[] args)
   {
      Random rand = new Random();
      
      int m = 2;
      int n = 3;
      double[][] data;
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
      for (int i = 0; i < m; i++)
      {
         for (int j = 0; j < n; j++)
         {
            System.out.printf("%.2f\t\t", data[i][j]);
            
         }
         System.out.println();
      }
      
      
      
   }
}