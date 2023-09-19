// 9.WAP to create and initialize 2D array of 2x2 and find the sum of all elements of an array.
public class _2Darray {
    public static void main(String [] args){
    int [][] array2D={
        {1,2},{3,4}
    };

    int sum=0;
    for (int i =0; i<array2D.length;i++){
        for(int j=0; j< array2D[i].length; j++){
            sum += array2D[i][j];
        }
    }
    System.out.println("Sum of array is:"+ sum);
}
}
