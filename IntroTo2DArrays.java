import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args){
    int[][] ray = new int[2][3];
    //ArrayList<int[][]>

    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;

    /*
       1  2  3
       4  5  6
     */

     System.out.println(Arrays.toString(ray));

     //Print the first array in the array ray
     System.out.println(Arrays.toString(ray[0]));
     System.out.println(Arrays.toString(ray[1]));

    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //Change every value in the 2D array to 7
    //You must use loopS

    //ray[#].length represents the number of columns in each array in the array
    // or what size is the array in theh array of arrays
    for(int row=0; row<ray.length; row++)
    {
      for(int col=0; col<ray[row].length; col++)
      {
        ray[row][col] = (int)(Math.random()*11 + 0);
      }
    }

    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //Find the sum of each row :)
    //You must use loopS
    int sum = 0;
    for(int row=0; row<ray.length; row++ )
    { 
      sum = 0;

      //Start our sum at 0 befire adding up the columns
      for(int col=0; col<ray[row].length; col++)
      {
        sum += ray[row][col];
      }

    System.out.println("The sum of row " + row + " is: " + sum);
    }

    System.out.println("\n\n\nHomework assignment");
    //add up the values of the array using for each loops...
    {
      for(int[] row: ray)
      {
        for(int num: row)
        {
          sum += num;
        }
      }

      System.out.println("The sum of all values in the array is " + sum);
      
    }

  }
}