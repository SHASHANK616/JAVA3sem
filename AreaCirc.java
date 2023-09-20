class p{
    final double pi=3.14;
     int r;
     
     public void area(int r){
        this.r=r;
        double Area = pi*this.r*this.r;
        System.out.println(Area);
     }
    }

public class AreaCirc {
    public static void main(String[] args){
        p p1 =new p();
        p1.area(5);
    }
}
