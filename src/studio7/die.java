package studio7;

public class die {

	private int nsides;
	private int landed;
	
	public die(int nsides) {
		this.nsides=nsides;
	}
	public int landed() {
		landed = ((int) (Math.random()*this.nsides+1));
		return landed;
	}
	
	public String toString() {
		landed = landed();
		int result = landed;
		return ("landed on " + result);
		
	}
	
	public static void main(String[] args) {
		die d1 = new die(8);
		System.out.println(d1.toString());
	}

}
