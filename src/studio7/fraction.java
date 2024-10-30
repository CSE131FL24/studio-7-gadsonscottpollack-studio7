package studio7;

public class fraction {

private int num;
private int den;
private int sumnum;
private int sumdem;
private int productnum;
private int productdom;

public fraction(int num, int den) {
	this.num=num;
	this.den=den;
}
public int numsum() {
	this.num=num*den;
this.den=den;
return (num + den);
}

public int densum() {
	this.den=den*den;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
