package view;

import javax.swing.JOptionPane;
import model.DAO.Medico;
import model.DAO.VerificarEscolha;

public class Tela {

	public void Apresentacao ()
	{
		JOptionPane.showMessageDialog(null, "Bem vindo(a) a clínica médica IFSP!");
		JOptionPane.showMessageDialog(null, "================ESPECIALIDADES DA CLÍNICA=================\n - Pediatria\n - Cirurgia Geral\n - Ginecologista\n - Obstetricia\n - Ortopedia\n - Traumatologia\n - Cardiologia\n - Oftalmologia\n - Radiologia\n - Neurologia\n - Dermatologia\n - Otorrinolaringologia ");
	}
	
	public void TelaEscolha ()
	{
		String codEscolha = JOptionPane.showInputDialog(null, "Deseja registrar novo paciente ou verificar a disponibilidade dos médicos?\n[R] para registrar\n[V] para verificar");
		VerificarEscolha.Escolha(codEscolha);
		Tela tela = new Tela();
		tela.TelaRegistro();
	}
	
	public void TelaRegistro ()
	{		
		String nome = JOptionPane.showInputDialog(null, "Nome do paciente: ");
		String idade = JOptionPane.showInputDialog(null, "Idade do paciente: ");
		String sexo = JOptionPane.showInputDialog(null, "Sexo do paciente: ");
		String convenio = JOptionPane.showInputDialog(null, "Nome do convênio médico: ");
		String data = JOptionPane.showInputDialog(null, "Data agendada: ");
		String especialidade = JOptionPane.showInputDialog(null, "Especialidade desejada: ");
		String EspecialidadeMedica = Medico.VerificarEspecialidade(especialidade);
		JOptionPane.showMessageDialog(null, "================FICHA DO PACIENTE================" +"\nNome: " +nome +"\nIdade: " +idade +"\nSexo: " +sexo +"\nConvênio Médico: " +convenio +"\nData da Consulta: " +data +"\n" +EspecialidadeMedica);
	}
	
	public void TelaVerificar() 
	{
		 String[] nomeMedico = {"Cesar Cohen", "Joui Jouki", "Elizabeth Webber", "Thiago Fritz", "Dante Gaspar", "Arthur Cevero", "Erin Parker", "Beatrice Portinari", "Carina Leone", "Rubens Naluti", "Antonio Portevedra", "Mia Verissimo"};
		 JOptionPane.showMessageDialog(null, "Médicos disponíveis para consulta:");
		 JOptionPane.showMessageDialog(null, nomeMedico);
			  
	}
}
