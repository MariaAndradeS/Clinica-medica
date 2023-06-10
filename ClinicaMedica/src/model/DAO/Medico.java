package model.DAO;

public class Medico {
	public static String VerificarEspecialidade (String especialidade) 
	{	
		 switch (especialidade.toLowerCase()) {
		 	case "pediatria":
		 		return "Médico Pediatra: Dr. Cesar Cohen";
		 		
		 	case "cirugia geral":
		 		return "Médico Cirurgião Geral: Dr. Joui Jouki";
		 	
		 	case "ginecologista":
		 		return "Médica Ginecologista: Dra. Elizabeth Webber";
		 		
		 	case "obstetricia": 
		 		return "Médico Obstetra: Dr. Thiago Fritz";
		 		
		 	case "ortopedia":
		 		return "Médico Ortopedista: Dr. Dante Gaspar";
		 		
		 	case "traumatologia":
		 		return "Médico Traumatologista: Dr. Arthur Cevero";
		 		
		 	case "cardiologia": 
		 		return "Médica Cardiologista: Dra. Erin Parker";
		 		
		 	case "oftalmologia": 
		 		return "Médica Oftalmologista: Dra. Beatrice Portinari";
		 		
		 	case "radiologia": 
		 		return "Médica Radiologista: Dra. Carina Leone";
		 		
		 	case "neurologia": 
		 		return "Médico Neurologista: Dr. Rubens Naluti";
		 		
		 	case "dermatologia": 
		 		return "Médico Dermatologista: Dr. Antonio Portevedra";
		 		
		 	case "otorrinolaringologia": 
		 		return "Médica Otorrinolaringolista: Dra. Mia Verissimo";
		 		
		 	default: 
		 		return "Especialidade não atendida";
		 		
		 }
	}
}
