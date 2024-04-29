package HerançaePolimorfismo;

import javax.swing.JOptionPane;

public class FuncionarioRegular extends Funcionario {
	private double bonusRegular;
	
	public FuncionarioRegular(String nome, int idade, double salario, double bonusRegular) {
		super(nome, idade, salario);
		this.setBonusRegular(bonusRegular);
	}

	public double getBonusRegular() {
		return bonusRegular;
	}

	public void setBonusRegular(double bonusRegular) {
		this.bonusRegular = bonusRegular;
	}
	
	public double calcularSalarioTotal() {
		return getSalario() + bonusRegular;
	}
	public double calcularSalarioLiquido() {
		return getSalario();
	}

	public String exibirDetalhes() {
			JOptionPane.showMessageDialog(null,"Nome: " + getNome() + " \n Idade" + getIdade() + "n Salário:"
					+ getSalario());
		return null;
	}
	
}
