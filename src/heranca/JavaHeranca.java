package heranca;

public class JavaHeranca {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		gato.setNome("Nick");
		gato.setIdade(7);
		gato.setRaca("Angorá");
		
		System.out.println(gato.getNome());
		System.out.println(gato.getIdade()); 
		System.out.println(gato.getRaca());
	}
	
	
}
