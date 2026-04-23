package thigk2.nguyen_anh_quynh;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class cau3 {
	    public static void main(String[] args) {
	        String fileName = "data"; // Tên file bạn tự tạo
	        ArrayList<Double> danhSachSo = new ArrayList<>();
	        
	        // 1. Đọc file văn bản
	        try {
	            File myFile = new File(fileName);
	            Scanner fileReader = new Scanner(myFile);
	            
	            System.out.println("--- Danh sách số thực đọc từ file ---");
	            while (fileReader.hasNextDouble()) {
	                double so = fileReader.nextDouble();
	                danhSachSo.add(so);
	                System.out.println(so);
	            }
	            fileReader.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Lỗi: Không tìm thấy file " + fileName);
	            // e.printStackTrace();
	            return; // Dừng chương trình nếu không có file
	        }

	        // 2. Kiểm tra giá trị X (Ngày sinh của sinh viên)
	        Scanner input = new Scanner(System.in);
	        System.out.print("\nNhập ngày sinh của bạn (X): ");
	        double x = input.nextDouble();

	        boolean timThay = false;
	        for (double so : danhSachSo) {
	            if (so == x) {
	                timThay = true;
	                break;
	            }
	        }

	        // 3. Thông báo kết quả
	        if (timThay) {
	            System.out.println("Kết quả: Giá trị X (" + x + ") CÓ trong danh sách.");
	        } else {
	            System.out.println("Kết quả: Giá trị X (" + x + ") KHÔNG có trong danh sách.");
	        }
	        
	        input.close();
	    }
	}
	

