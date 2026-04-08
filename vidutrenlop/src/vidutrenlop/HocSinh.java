package vidutrenlop;

public class HocSinh {
	private String tenHS;
	private int namsinhHS;
	
	public HocSinh() {
		
	}
	
	public HocSinh(String tenHS, int namsinhHS) {
		this.tenHS = tenHS;
		this.namsinhHS = namsinhHS;
	}
	
	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public int getNamsinhHS() {
		return namsinhHS;
	}
	public void setNamsinhHS(int namsinhHS) {
		this.namsinhHS = namsinhHS;
	}
	@Override
	public String toString() {
		return "HocSinh [tenHS=" + tenHS + ", namsinhHS=" + namsinhHS + "]";
				
	}
	
	 public int tuoi() {
			int tuoi = 0;
		 	int t = 2026;
			return tuoi =  t - namsinhHS;	
		}
		
	
}

