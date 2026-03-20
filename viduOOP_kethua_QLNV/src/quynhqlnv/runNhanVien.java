package quynhqlnv;

public class runNhanVien {
	public static void main(String[] args) {
		//test lop nhan vien
		NhanVien nv1 = new NhanVien("001", "Nguyễn Anh Quỳnh", 2500000);
//		nv1.hienThiThongTin();
		System.out.println(nv1.toString());
		
		NhanVienVanPhong nvvp1 = new NhanVienVanPhong("002", "Nguyễn Văn A", 2500000, 3, 200000);
		System.out.println(nvvp1.toString());
//		nvvp1.hienThiThongTin();
	}
}
