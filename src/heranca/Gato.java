//Após a criação da interface, implementar na classe abstrata e inserir o nome da classe/interface
//E depois implementar os métodos contidos na classe/interface
package heranca;

public class Gato extends Animal implements AnimalEstimacao {
	
	private String nome;
	private String raca;
	private int idade;
	
	@Override
	public void brincar() {
		
	}

	@Override
	public void serAmigavel() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
