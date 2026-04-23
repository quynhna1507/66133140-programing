package thigk2.nguyen_anh_quynh;


	public class SanPham {
	    private String maSP;
	    private String tenSP;
	    private String loaiSP;
	    private double giaTien; // Thuộc tính thứ 4 tự thêm

	    // Constructor đầy đủ tham số
	    public SanPham(String maSP, String tenSP, String loaiSP, double giaTien) {
	        this.maSP = maSP;
	        this.tenSP = tenSP;
	        this.loaiSP = loaiSP;
	        this.giaTien = giaTien;
	    }

	    // Các Getter và Setter
	    public String getMaSP() { return maSP; }
	    public void setMaSP(String maSP) { this.maSP = maSP; }

	    public String getTenSP() { return tenSP; }
	    public void setTenSP(String tenSP) { this.tenSP = tenSP; }

	    public String getLoaiSP() { return loaiSP; }
	    public void setLoaiSP(String loaiSP) { this.loaiSP = loaiSP; }

	    public double getGiaTien() { return giaTien; }
	    public void setGiaTien(double giaTien) { this.giaTien = giaTien; }

	    // Phương thức hiển thị thông tin
	    @Override
	    public String toString() {
	        return String.format("Mã: %s | Tên: %s | Loại: %s | Giá: %.2f", 
	                              maSP, tenSP, loaiSP, giaTien);
	    }
	}


