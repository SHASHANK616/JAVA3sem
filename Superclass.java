class A{
    int a=100;
    int b=200;
}

class B extends A{
    int a=300;
    int b=400;

    void display(){
        System.out.printf("%d %d %d %d ",a,b,super.a,super.b);
    }

}

public class Superclass {
    public static void main(String[] args){
        B b1 = new B();
        b1.display();
    }
    
}
