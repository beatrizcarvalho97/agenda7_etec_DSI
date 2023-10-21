package agenda7;

import javax.swing.JOptionPane;

public class Agenda7 {

	public static void main(String[] args) {
		//Inicio do programa, onde foram declaradas as variáveis.
		String nome;
		int idade, opiniao;
		int i;
		// Foi necessário criar duas variáveis para armazenar a quantidade de pessoas
		// que inseriu as notas 1 e 3 para a pesquisa.
		int contagemExcelente = 0;
		int contagemRuim = 0;

		// O for será responsável por criar o "loop" onde as 50 pessoas deverão informar
		// os dados para a pesquisa.
		for (i = 1; i <= 3; i++) {
			//As próximas três linhas se referem a interações com o usuário, onde o programa só dará sequência se o usuário interagir.
			nome = JOptionPane.showInputDialog("Bem Vindo a nossa pesquisa de satisfação!\nDigite o seu Nome: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));
			opiniao = Integer.parseInt(JOptionPane
					.showInputDialog("Digite a nota com relação ao atendimento: (1 - EXCELENTE, 2 - BOM ou 3 - RUIM)"));

			// estrutura Switch Case, onde restringi as opções para 1,2 e 3; além de também exibir na sequência uma tela onde são apresentados um agradecimento e os dados do usuário que preencheu a pesquisa.

			switch (opiniao) {

			case 1:
				JOptionPane.showMessageDialog(null, "Obrigada por responder a pesquisa! " + nome + "\nIdade: " + idade
						+ "\nNota para atendimento: " + opiniao + " - EXCELENTE");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Obrigada por responder a pesquisa! " + nome + "\nIdade: " + idade
						+ "\nNota para atendimento: " + opiniao + " - BOM");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Obrigada por responder a pesquisa! " + nome + "\nIdade: " + idade
						+ "\nNota para atendimento: " + opiniao + " - RUIM");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Ops, nota não existente!", "Erro", JOptionPane.ERROR_MESSAGE);
				break;
			}
			// Ainda dentro do FOR, elaborei um tipo de validação sobre o valor inserido na
			// variável Opinião, para que a contagem dos itens 1 e 3 possam ocorrer.
			if (opiniao == 1) {
				contagemExcelente++;
			} else if (opiniao == 3) {
				contagemRuim++;
			}
		}
		//Para finalizar, abaixo será apresentada uma tela informando a quantidade de notas do tipo Excelente e Ruim quanto ao atendimento.
		JOptionPane.showMessageDialog(null,
				"A quantidade de clientes que avaliou o atendimento como EXCELENTE foi: " + contagemExcelente
						+ "\nA quantidade de clientes que avaliou o atendimento como RUIM foi: " + contagemRuim);

	}

}