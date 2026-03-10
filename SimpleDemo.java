class Box {
   double height;
   double width;
   double breath;
   double volume() {
      return height*width*breath;
   }
   double AddedVolume(int a){
      return (height*width*breath)+a;
   }
   void MultipliedVolume(int b){
      System.out.println((height*width*breath)*b);
   }
}
public class SimpleDemo{
   public static void main(String[] args){
      Box obj1 = new Box();
      obj1.height = 2.0;
      obj1.width = 3.0;
      obj1.breath = 5.0;
      System.out.println(obj1.volume());
      System.out.println(obj1.AddedVolume(10));
      obj1.MultipliedVolume(2);
   }
}
