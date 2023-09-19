// 3.WAP to find the average of an array with 5 elements (10 to 50).

public class ArrAvg {
    public static void main(String [] args){
        int sum=0;
        float avg;
        int arr[]={10,20,30,40,50};

        for(int i=0;i<5;i++){
            sum=sum + arr[i];
        }
        avg=(float) sum / 5;
        System.out.println("Average of array is:"+avg);
    }
}
