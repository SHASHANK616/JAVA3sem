//4. WAP to sum two integer numbers, declare static integers in class other than the main class.
class sum{
 static int a;
 static int b;
}

public class Static_Other{
    public static void main(String [] args){
    sum.a=40;
    sum.b=60;
    int _sum = sum.a+sum.b;
    System.out.println(_sum);

    }
}