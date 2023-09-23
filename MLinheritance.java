class grandParent {
   public void display() {
      System.out.println("Inside display");
   }
}
class Parent extends grandParent {
   public void area() {
      System.out.println("Inside area");
   }
}
class child extends Parent {
   public void volume() {
      System.out.println("Inside volume");
   }
}
public class MLinheritance {
   public static void main(String[] arguments) {
      child R = new child();
      R.display();
      R.area();
      R.volume();
   }
}
