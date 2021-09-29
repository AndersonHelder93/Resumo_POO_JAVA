package heranca;

public class Animal {
	String nome;
	String sexo;
	int fome;
	int forca;
	int energia;
	
	public void comer() {
		System.out.println("O animal vai comer");
	}
	
	public void cacar() {
		System.out.println("O animal vai cacar");
	}
	
	public int fazerSom(int volume) {
		System.out.println("O animal vai fazer um som "+ volume + "AAHH");
		return volume++;
	}
	
	protected String fazerAlgo() {
		return "Hello";
	}
	
	public void dormir() {
		System.out.println("O animal vai dormir");
	}
	
	private void lutar() {
		System.out.println("O animal vai lutar");
	}
}
