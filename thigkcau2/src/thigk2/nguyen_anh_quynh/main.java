package thigk2.nguyen_anh_quynh;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> dsSanPham = new ArrayList<>();

        // 1. Hard-code tạo danh sách 3 sản phẩm
        dsSanPham.add(new SanPham("SP01", "Sữa hot", "Thực phẩm", 20000));
        dsSanPham.add(new SanPham("SP02", "Vitamin C", "Thực phẩm chức năng", 150000));
        dsSanPham.add(new SanPham("SP03", "Bánh mì", "Thực phẩm", 15000));

        System.out.println("--- Danh sách 3 sản phẩm ban đầu ---");
        for (SanPham sp : dsSanPham) {
            System.out.println(sp);
        }

        // 2. Thêm mới một sản phẩm từ bàn phím
        System.out.println("\n--- Nhập thông tin sản phẩm mới ---");
        System.out.print("Nhập mã SP: "); String ma = sc.nextLine();
        System.out.print("Nhập tên SP: "); String ten = sc.nextLine();
        System.out.print("Nhập loại SP: "); String loai = sc.nextLine();
        System.out.print("Nhập giá tiền: "); double gia = sc.nextDouble();
        
        dsSanPham.add(new SanPham(ma, ten, loai, gia));

        // 3. In lại danh sách sau khi thêm
        System.out.println("\n--- Danh sách tất cả sản phẩm hiện tại ---");
        for (SanPham sp : dsSanPham) {
            System.out.println(sp);
        }

        // 4. In danh sách sản phẩm có loại là "Thực phẩm chức năng"
        System.out.println("\n--- Danh sách Thực phẩm chức năng ---");
        boolean check = false;
        for (SanPham sp : dsSanPham) {
            // Dùng equalsIgnoreCase để so sánh chuỗi không phân biệt hoa thường
            if (sp.getLoaiSP().equalsIgnoreCase("Thực phẩm chức năng")) {
                System.out.println(sp);
                check = true;
            }
        }
        if (!check) System.out.println("Không tìm thấy sản phẩm nào thuộc loại này.");

        sc.close();
    }
}