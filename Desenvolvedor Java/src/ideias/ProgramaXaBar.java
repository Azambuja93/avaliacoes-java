package ideias;

public class ProgramaXaBar {
	public static void main(String[] args) {
		
		OrshaBar contatobar = new OrshaBar();
		contatobar.setBrahma(50);
	
		Cliente CMCareca = new Cliente();
		CMCareca.setGrupo("Contato Mecânico");
		CMCareca.setNome("Careca");
		CMCareca.setSaldo(100);
		
		CMCareca.imprimirInfo();
		
		CMCareca.setSaldo(200);
	
		CMCareca.imprimirInfo();
	}
}
