
public class TesteConversao {
	
	public static void main(String[] args) {
		
		Conversoes conversoes = new Conversoes(345);
		
		System.out.println(conversoes.converterDeDolarParaReal());
		System.out.println(conversoes.converterDeRealParaDolar());
		
	}
}