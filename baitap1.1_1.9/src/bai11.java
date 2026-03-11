public class TestCircle {
   public static void main(String[] args) {
      Circle c1 = new Circle();
      System.out.println("hình tròn có bán kính là  " 
         + c1.getRadius() + " diện tích là " + c1.getArea());   
      Circle c2 = new Circle(2.0);    
      System.out.println("hình tròn có bán kính là " 
         + c2.getRadius() + " và diện tích là " + c2.getArea());
   }
}