package quynh1507;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ViDuDocStream {
	public static void main(String[] args) throws IOException {
		//Khai bao bien doi tuong InputSreamReader
		InputStreamReader ipReader = new InputStreamReader(System.in);
		//Khai bao bien doi tuong Buffee
		BufferedReader br = new BufferedReader(ipReader);
		
		//In mot cau huong dan de User biet can lam gi
		System.out.print("Nhap mot chuoi bat ky: ");
		//Doc du lieu tu ban phim, cat vao bien chuoi
		String lineDocDuoc = br.readLine();
		//In ra dong doc duoc
		System.out.println(lineDocDuoc);
	}
}