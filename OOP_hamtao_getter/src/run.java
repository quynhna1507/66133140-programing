
public class run {

	public static void main(String[] args) {
    Chunhat cn1 = new Chunhat();
    Chunhat cn2 = new Chunhat(20,15);
    Chunhat hv = new Chunhat(15,15);
    
    double cn1_dai= cn1.getDai();
    double cn1_rong = cn1.getRong();
    System.out.print("hình chữ nhật có chiều dài là : "); 
    System.out.print(cn1_dai);
    System.out.print("hình chữ nhật có chiều rộng là : ");
    System.out.print(cn1_rong);
    
    
    //thay doi chieu dai 
    
    cn1.setDai(50);
    System.out.print("sau khi thay đổi chiều dài \n");
    cn1_dai= cn1.getDai();
    cn1_rong = cn1.getRong();
    System.out.print("hình chữ nhật có chiều dài là : ");
    System.out.print(cn1_dai);
    System.out.print("hình chữ nhật có chiều rộng là : ");
    System.out.print(cn1_rong);
}
	

}
