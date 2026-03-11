
public class Chunhat {
   private double dai;
   private double rong;    

public Chunhat() {    //ham tao
	dai=10;
	rong=5;
	
}
public Chunhat(double dai,double rong) {
	this.dai = dai;	
}


double getDai() {
	return dai;
}    //getter
double getRong() {
	return rong;
}
void setDai(double daiM) {
	dai=daiM;
}
void setRong(double rongM) {
	rong=rongM;
}
}
