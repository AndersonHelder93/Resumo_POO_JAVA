package heranca;

public class Tigre extends Felino { // Herdo os atributos da classe Animal
	
	@Override // sobrescreve o mesmo método criado na classe mãe
	public void cacar() {
		System.out.println("O tigre vai cacar");
	}
	
	@Override
	public int fazerSom (int volume) {
		System.out.println("O volume aumentou");
		return volume+10;
	}
	
	@Override
	protected String fazerAlgo() {
		return "Olaa";
	}
	
	//Overloadin -> Um método com o mesmo nome, mas com a quantidade de argumentos diferentes.
	public int corridaMax(int x, int y) {
		int res = x*y;
		return res;
	}
	
	public int corridaMax(int x, int y, int z) {
		int res = x+y+z;
		System.out.println(res);
		return res;
	}
	
	public double corridaMax (Double x, int y) {
		return (Double) x+y;
	}
}
