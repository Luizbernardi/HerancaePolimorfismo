package HerançaePolimorfismo;

import javax.swing.JOptionPane;

public class MainHerançaePolimorfismo {


	public static void main(String[] args) {
		menu();

	}
	public static void menu () {
		int opcao;
		do {opcao = Integer.parseInt(JOptionPane.showInputDialog("=== Selecione o setor desejado ===\n" +
				"1. Funcionario Regular \n" +
				"2. Gerente \n" +
				"3. Diretores \n" +
				"0. Sair \n" +
				"Escolha uma opção:"));
		switch (opcao) {
		case 1:
			menuFuncionarioRegular();
			break;
		case 2:
			menuGerente();
			break;
		case 3:
			menuDiretores();
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Saindo");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}
		} while (opcao !=0);
	}
	private static void menuFuncionarioRegular() {
		FuncionarioRegular funcionarioRegular = null;
		int opcao;
		do {opcao = Integer.parseInt(JOptionPane.showInputDialog("=== Selecione o setor desejado ===\n" +
				"1. Cadastrar Funcionario Regular \n" +
				"2. Calcular Salario Liquido \n" +
				"3. Calcular Salario Total \n" +
				"4. Exibir Detelahes \n" +
				"0. Sair \n" +
				"Escolha uma opção:"));
		switch (opcao) {
		case 1:
			funcionarioRegular = cadastrarFuncionarioRegular(); 
			break;
		case 2:
			if (funcionarioRegular != null) {
				calcularSalarioLiquido(funcionarioRegular); 
			} else {
				JOptionPane.showMessageDialog(null, "Por favor, cadastre um funcionário regular primeiro.");
			}
			break;
		case 3:
			if (funcionarioRegular != null) {
				calcularSalarioTotal(funcionarioRegular); 
			} else {
				JOptionPane.showMessageDialog(null, "Por favor, cadastre um funcionário regular primeiro.");
			}
			break;
		case 4:
			if (funcionarioRegular != null) {
				exibirDetalhes(funcionarioRegular); 
			} else {
				JOptionPane.showMessageDialog(null, "Por favor, cadastre um funcionário regular primeiro.");
			}
			break;
		}
		} while (opcao != 0);
	}
	private static FuncionarioRegular cadastrarFuncionarioRegular() {
		String nome = JOptionPane.showInputDialog("Nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
		double bonusAnual = Double.parseDouble(JOptionPane.showInputDialog("Bônus Anual:"));

		return new FuncionarioRegular(nome, idade, salario, bonusAnual); 
	}
	private static void calcularSalarioLiquido(FuncionarioRegular funcionarioRegular) {
		double salarioLiquido = funcionarioRegular.calcularSalarioLiquido();
		JOptionPane.showMessageDialog(null, "Salário líquido de " + funcionarioRegular.getNome() + ": " + salarioLiquido);
	}
	private static void calcularSalarioTotal(FuncionarioRegular funcionarioRegular) {
		double salarioTotal = funcionarioRegular.calcularSalarioTotal();
		JOptionPane.showMessageDialog(null, "Salário Total é " + funcionarioRegular.getNome() + ": " + salarioTotal);
	}
	private static void exibirDetalhes(FuncionarioRegular funcionarioRegular) {
		JOptionPane.showMessageDialog(null, "Detalhes do funcionário:\n" +
				"Nome: " + funcionarioRegular.getNome() + "\n" +
				"Idade: " + funcionarioRegular.getIdade() + "\n" +
				"Salário: " + funcionarioRegular.getSalario() + "\n" +
				"Bônus Funcionario Regular: " + funcionarioRegular.getBonusRegular());
	}
	private static void menuGerente() {
		Gerente gerente = null;

		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("=== Selecione o que deseja fazer ===\n" +
					"1. Cadastrar Gerente \n" +
					"2. Calcular Salario Liquido \n" +
					"3. Calcular Salario Total \n" +
					"4. Exibir Detalhes \n" +
					"0. Sair \n" +
					"Escolha uma opção:"));
			switch (opcao) {
			case 1:
				gerente = cadastrarGerente(); 
				break;
			case 2:
				if (gerente != null) {
					calcularSalarioLiquido(gerente); 
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, cadastre um gerente primeiro.");
				}
				break;
			case 3:
				if (gerente != null) {
					calcularSalarioTotal(gerente); 
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, cadastre um gerente primeiro.");
				}
				break;
			case 4:
				if (gerente != null) {
					exibirDetalhes(gerente); 
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, cadastre um gerente primeiro.");
				}
				break;
			}
		} while (opcao != 0);
	}
	private static Gerente cadastrarGerente() {
		String nome = JOptionPane.showInputDialog("Nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
		double bonusAdicional = Double.parseDouble(JOptionPane.showInputDialog("Bônus Adicional:"));

		return new Gerente(nome, idade, salario, bonusAdicional); 
	}
	private static void calcularSalarioLiquido(Gerente gerente) {
		double salarioLiquido = gerente.calcularSalarioLiquido();
		JOptionPane.showMessageDialog(null, "Salário líquido de " + gerente.getNome() + ": " + salarioLiquido);
	}
	private static void calcularSalarioTotal(Gerente gerente) {
		double salarioTotal = gerente.calcularSalarioTotal();
		JOptionPane.showMessageDialog(null, "Salário Total de " + gerente.getNome() + ": " + salarioTotal);
	}
	private static void exibirDetalhes(Gerente gerente) {
		JOptionPane.showMessageDialog(null, "Detalhes do gerente:\n" +
				"Nome: " + gerente.getNome() + "\n" +
				"Idade: " + gerente.getIdade() + "\n" +
				"Salário: " + gerente.getSalario() + "\n" +
				"Bônus Gerente: " + gerente.getBonusGerente());
	}
	private static void menuDiretores() {
		Diretores diretor = null; 

		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("=== Selecione o que deseja fazer ===\n" +
					"1. Cadastrar Diretor \n" +
					"2. Calcular Salario Liquido \n" +
					"3. Calcular Salario Total \n" +
					"4. Exibir Detalhes \n" +
					"0. Sair \n" +
					"Escolha uma opção:"));
			switch (opcao) {
			case 1:
				diretor = cadastrarDiretor(); 
				break;
			case 2:
				if (diretor != null) {
					calcularSalarioLiquido(diretor); 
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, cadastre um diretor primeiro.");
				}
				break;
			case 3:
				if (diretor != null) {
					calcularSalarioTotal(diretor); 
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, cadastre um diretor primeiro.");
				}
				break;
			case 4:
				if (diretor != null) {
					exibirDetalhes(diretor); 
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, cadastre um diretor primeiro.");
				}
				break;
			}
		} while (opcao != 0);
	}
	private static Diretores cadastrarDiretor() {
		String nome = JOptionPane.showInputDialog("Nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
		double bonusAnual = Double.parseDouble(JOptionPane.showInputDialog("Bônus Anual:"));

		return new Diretores(nome, idade, salario, bonusAnual);
	}
	private static void calcularSalarioLiquido(Diretores diretor) {
		double salarioLiquido = diretor.calcularSalarioLiquido();
		JOptionPane.showMessageDialog(null, "Salário líquido de " + diretor.getNome() + ": " + salarioLiquido);
	}
	private static void calcularSalarioTotal(Diretores diretor) {
		double salarioTotal = diretor.calcularSalarioTotal();
		JOptionPane.showMessageDialog(null, "Salário Total de " + diretor.getNome() + ": " + salarioTotal);
	}
	private static void exibirDetalhes(Diretores diretor) {
		JOptionPane.showMessageDialog(null, "Detalhes do diretor:\n" +
				"Nome: " + diretor.getNome() + "\n" +
				"Idade: " + diretor.getIdade() + "\n" +
				"Salário: " + diretor.getSalario() + "\n" +
				"Bônus Diretores: " + diretor.getBonusDiretores());
	}
}


