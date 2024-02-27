package Classes;

public class Calcula {


	private double result = 0;
	
	
	
public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

public double somar (double num1, double num2) {
	
	this.result = num1 + num2;
	return result;
	
}
	
public double subtrair (double num1, double num2) {
	
	result = num1 - num2;
	return result;
	
}

	
}
