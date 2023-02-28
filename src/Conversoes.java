
public class Conversoes {
	
	private double taxaDolarReal = 5.22;
	private double taxaRealDolar = 0.19;	
	private double taxaEuroReal = 5.53;
	private double taxaRealEuro = 0.18;
	private double taxaLibraEsterlinaReal = 6.30;
	private double taxaRealLibraEsterlina = 0.15;
	private double taxaPesoArgentinoReal = 0.027;
	private double taxaRealPesoArgentino = 37.03;
	private double taxaPesoChilenoReal = 0.0063;
	private double taxaRealPesoChileno = 158.73;
	private double valor;

	
	
	public Conversoes(double valor) {
		this.valor = valor;
	}

	public double converterDeRealParaDolar() {
		return this.taxaRealDolar * this.valor;
	}
	
	public double converterDeDolarParaReal() {
		return this.taxaDolarReal * this.valor;
	}
	
	public double converterDeRealParaEuro() {
		return this.taxaRealEuro * this.valor;
	}
	
	public double converterDeEuroParaReal() {
		return this.taxaEuroReal * this.valor;
	}
	
}
