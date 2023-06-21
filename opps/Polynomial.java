package opps;

public class Polynomial {
	DynamicArray coefficients;
	
	public Polynomial() {
		
	}
	public void setCoefficient(int deg, int coeff) {
		
	}
	public int getCoefficient(int deg) {
		
	}
	
	public int degree() {
		return coefficients.size();
	}
	
	public void print() {
		
	}
	
	public void add(Polynomial p) {
		for(int i=0;i<=p.degree();i++) {
			this.setCoefficient(i, this.getCoefficient(i)+p.getCoefficient(i));
		}
	}
	
	public void subtract(Polynomial p) {
		
	}
	
	public void multiply(Polynomial p) {
		
	}
	
	public int evaluate(int x) {
		
	}
	
	public static Polynomial add(Polynomial p1, Polynomial p2) {
		
	}
}
