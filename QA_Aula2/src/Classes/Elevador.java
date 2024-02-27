package Classes;

public class Elevador {
	private int id;
	private double cargaMaxima =200;
	private double cargaAtual;
	private boolean sinalAlerta = true;
	
	
	
	public double entrarNoelevador (double cargaAtual, double peso) {
		Calcula calc = new Calcula();
		//return calc.somar(peso, getCargaAtual());
		return calc.somar(cargaAtual, peso);
		
		
		
	}
	
	public double sairNoelevador ( double peso, double cargaAtual) {
		Calcula calc = new Calcula();
		return calc.subtrair(peso, cargaAtual);
		
		
	}

	public boolean avaliarPeso ( double peso) {
		if(cargaAtual>cargaMaxima) {
			return sinalAlerta =true;
			
		}
		return sinalAlerta = false;
		
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public double getCargaAtual() {
		return cargaAtual;
	}
	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}
	public boolean isSinalAlerta() {
		return sinalAlerta;
	}
	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}


	
	
	

}
