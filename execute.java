/* Program using this and super keyword in a single program*/
import java.util.*;
class Fruit {
   String name;
   Fruit(String name) {
      this.name = name;
   }
   public void vitamin() {
      System.out.println("Fruit is good for health");
   }
   public void show() {
      System.out.println(name);
   }
}
class Mango extends Fruit {
   Mango() {
      this("Test");
   }
   Mango(String name) {
      super(name);
   }
   public void vitamin() {
      super.vitamin();
      System.out.println("Mango is the king of fruits");
   }
}
public class execute {
   public static void main(String args[]) {
      Fruit f = new Mango("Papaya");
      f.show();
      f.vitamin();
   }
}