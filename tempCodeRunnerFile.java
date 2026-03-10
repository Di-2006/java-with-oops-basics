class Box {
   double height;
   double width;
   double breath;
   void volume() {
      double var1 = this.height * this.width * this.breath;
      System.out.println("Volume: " + var1);
   }
}
public class SimpleDemo{
   public static void main(String[] args){
      Box obj1 = new Box();
      obj1.height = 2.0;
      obj1.width = 3.0;
      obj1.breath = 5.0;
      obj1.volume();
   }
}
