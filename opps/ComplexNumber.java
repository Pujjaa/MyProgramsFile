package opps;

public class ComplexNumber {
	private int real;
	private int imaginary;
	int count=0;
	
	public ComplexNumber(int real, int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public int getImaginary() {
		return imaginary;
	}
	
	public int getReal() {
		return real;
	}
	
	public void setReal(int real) {
		this.real=real;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary=imaginary;
	}
	
	public void print() {
		if(imaginary< 0) {
			System.out.println(real+" "+"-"+" "+"i"+Math.abs(imaginary));
		}else {
			System.out.println(real+" "+"+"+" "+"i"+imaginary);
		}
	}
	
	public void add(ComplexNumber c2) {
		this.real=this.real + c2.real;
		this.imaginary=this.imaginary + c2.imaginary;
	}
	
	public void multiply(ComplexNumber c2) {
		int newR=(this.real * c2.real) - (this.imaginary * c2.imaginary);
		int newIm=(this.real * c2.imaginary) + (this.imaginary * c2.real);
		this.setReal(newR);
		this.setImaginary(newIm);
	}
	
	public ComplexNumber conjugate() {
		int r= real;
		int imag=imaginary;
		
		ComplexNumber conj=new ComplexNumber(r,imag);
		return conj;
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		int newreal=c1.real  + c2.real;
		int newimag=c1.imaginary + c2.imaginary;
		ComplexNumber com=new ComplexNumber(newreal, newimag);
			return com;
	}
}
