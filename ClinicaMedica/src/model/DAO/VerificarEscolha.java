package model.DAO;

import javax.swing.JOptionPane;
import view.Tela;

public class VerificarEscolha {
	public static void Escolha(String codEscolha){
		String registro = "R";
		String verificar = "V";
		
		if(codEscolha.equalsIgnoreCase(registro)) {
			Tela tela = new Tela();
			tela.TelaRegistro();
		}else if(codEscolha.equalsIgnoreCase(verificar)) {
			Tela tela = new Tela();
			tela.TelaVerificar();
		}else
		JOptionPane.showMessageDialog(null, "Opção inválida");
		System.exit(0);
	}

}
