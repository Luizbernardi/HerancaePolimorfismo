package HerançaePolimorfismo;

import javax.swing.JOptionPane;

public class Diretores extends Funcionario {
	private double bonusDiretores;
	public Diretores(String nome, int idade, double salario, double bonusDiretores) {
		super(nome, idade, salario);
		this.setBonusDiretores(bonusDiretores);
		
	}
	public double getBonusDiretores() {
		return bonusDiretores;
	}
	public void setBonusDiretores(double bonusDiretores) {
		this.bonusDiretores = bonusDiretores;
	}
	public double calcularSalarioTotal() {
		return getSalario() + bonusDiretores;
	}
	public double calcularSalarioLiquido() {
		return getSalario();
	}
	public String exibirDetalhes() {
		JOptionPane.showMessageDialog(null,"Nome: " + getNome() + " \n Idade" + getIdade() + "\n Salário:"
				+ getSalario() + "\n Bonus Diretores" + bonusDiretores);
	return null;
}
	

}
