package nhap_xuat_tinhtoan;

import java.util.Scanner;

public class tinhtoan {
	public static void main(String[] args) {
	//khai bao bien
	double num1,num2,tong;
	//khai bao scanner
	Scanner banphim = new Scanner(System.in);
	//in ra thong bao
	System.out.print("nhập số thứ nhất: ");
	num1 =  banphim.nextDouble();
	System.out.print("nhập số thứ hai: ");
	num2 =  banphim.nextDouble();
	// tinh toan
	tong = num1+num2;
	//xuat
	System.out.print("tổng của 2 số là:   " + tong);


}
}