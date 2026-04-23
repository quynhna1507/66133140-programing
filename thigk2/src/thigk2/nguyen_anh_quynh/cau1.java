package thigk2.nguyen_anh_quynh;
import java.util.Scanner;

public class cau1 {

		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // a. Hỏi người dùng về thông tin tọa độ
		        System.out.println("--- Nhập tọa độ góc Trên-Trái ---");
		        System.out.print("x1: ");
		        double x1 = sc.nextDouble();
		        System.out.print("y1: ");
		        double y1 = sc.nextDouble();

		        System.out.println("--- Nhập tọa độ góc Dưới-Phải ---");
		        System.out.print("x2: ");
		        double x2 = sc.nextDouble();
		        System.out.print("y2: ");
		        double y2 = sc.nextDouble();

		        // Tính toán chiều rộng và chiều cao
		        double width = Math.abs(x2 - x1);
		        double height = Math.abs(y2 - y1);

		        // b. Tính Chu vi và Diện tích
		        double chuVi = (width + height) * 2;
		        double dienTich = width * height;

		        // Xuất kết quả ra màn hình
		        System.out.println("\n--- Kết quả ---");
		        System.out.println("Chiều rộng: " + width);
		        System.out.println("Chiều cao: " + height);
		        System.out.printf("Chu vi hình chữ nhật: %.2f\n", chuVi);
		        System.out.printf("Diện tích hình chữ nhật: %.2f\n", dienTich);
		        
		        sc.close();
		    }
		    
		}

