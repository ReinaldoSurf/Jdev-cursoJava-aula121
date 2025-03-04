package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	/*Main � um metodo auto execut�vel em Java com swing*/
	public static void main(String[] args) {
	
		// new Aluno() � uma inst�ncia - Cria��o do objeto
		// aluno1 � uma refer�ncia para o objeto aluno
		
		//Entrada de dados
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno:");
		String idade = JOptionPane.showInputDialog("Qual a idade:");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento:");
		String rg = JOptionPane.showInputDialog("Registro Geral:");
		String cpf = JOptionPane.showInputDialog("Qual o CPF:");
		String mae = JOptionPane.showInputDialog("Nome da m�e:");
		String pai = JOptionPane.showInputDialog("Nome do pai:");
		String matricula = JOptionPane.showInputDialog("Data da matricula:");
		String serie = JOptionPane.showInputDialog("Qual a S�rie:");	
		String escola = JOptionPane.showInputDialog("Nome da escola:");
		String note1 = JOptionPane.showInputDialog("Nota 1:");
		String note2 = JOptionPane.showInputDialog("Nota 2:");
		String note3 = JOptionPane.showInputDialog("Nota 3:");
		String note4 = JOptionPane.showInputDialog("Nota 4:");
	
				
		//instancia classe aluno 
		
		Aluno aluno1 = new Aluno();
		
		//Inicializando os objetos
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(note1));
		aluno1.setNota1(Double.parseDouble(note2));
		aluno1.setNota1(Double.parseDouble(note3));
		aluno1.setNota1(Double.parseDouble(note4));	

		/*descri��o do objeto na mem�ria*/
		
		
		System.out.println(aluno1.toString());
		System.out.println("M�dia do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
	
	}

	
	
}
