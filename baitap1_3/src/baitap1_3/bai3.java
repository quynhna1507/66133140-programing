public class TestMain {
   public static void main(String[] args) {
      // Kiểm tra các hàm tạo và phương thức toString() 
      // Bạn cần thêm ký tự 'f' hoặc 'F' vào cuối một giá trị float
      Rectangle r1 = new Rectangle(1.2f, 3.4f);
      System.out.println(r1);   // toString() 
      Rectangle r2 = new Rectangle();   // hàm tạo mặc định
      System.out.println(r2);

      // Kiểm thử các phương thức thiết lập và lấy giá trị
      r1.setLength(5.6f);
      r1.setWidth(7.8f);
      System.out.println(r1);   // toString()
      System.out.println("Chiều dài là: " + r1.getLength());
      System.out.println("Chiều rộng là: " + r1.getWidth());

      // Kiểm tra getArea() và getPerimeter()
      System.out.printf("Diện tích là: %.2f%n", r1.getArea());
      System.out.printf("chu vi là: %.2f%n", r1.getPerimeter());
   }
}