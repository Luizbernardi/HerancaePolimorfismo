package HerançaePolimorfismo;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario {
	private double bonusGerente;
	public Gerente(String nome, int idade, double salario, double bonusGerente) {
		super(nome, idade, salario);
		this.setBonusGerente(bonusGerente);
	}
	public double getBonusGerente() {
		return bonusGerente;
	}
	public void setBonusGerente(double bonusGerente) {
		this.bonusGerente = bonusGerente;
	}
	public double calcularSalarioTotal(){
		return getSalario() + bonusGerente;
	}
	public double calcularSalarioLiquido() {
		return getSalario();
	}
	public String exibirDetalhes() {
		JOptionPane.showMessageDialog(null,"Nome: " + getNome() + " \n Idade" + getIdade() + "\n Salário:"
				+ getSalario());
	return null;
}

}
