//2.	WAP to calculate the sum of first 50 natural numbers.
public class SumF50 {
    public static void main(String [] args){
        int num=50;
        int i=1;
        int sum=0;
        while (i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first 50 natural number is:"+sum);

    }
}
