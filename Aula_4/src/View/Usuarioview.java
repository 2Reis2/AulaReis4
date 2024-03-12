package View;

import model.ContaCorrente;
import model.ContaPoupança;

public class Usuarioview {
  Mensagens mensagem = new Mensagens();
	
	public void InterfacedoUsuario() {
	 int Opcao;
	 String OpcaoSelecionada;
	 
	    OpcaoSelecionada = mensagem.solicitarEntrada(""
		+ "Selecione uma opção"
	    + "\n1 Criar conta"
		+ "\n2 Fazer Saque"
	    + "\n3 Verificar Saldo");  
	  
	    Opcao = Integer.parseInt(OpcaoSelecionada);
	    switch (Opcao) {
	case 1:
		String tipodeconta;
		tipodeconta = mensagem.solicitarEntrada(
			"Qual tipo de conta derseja?"
		 + "\n1 - Corrente"
		 + "\n2 - Poupança");
		
		String EmailUsuario;
		EmailUsuario = mensagem.solicitarEntrada("Digite seu Email:");
		
		
		
		if (tipodeconta.equals("2")) {
			ContaPoupança conta = new ContaPoupança(EmailUsuario);
		} if (tipodeconta.equals("1")) {
			ContaCorrente conta = new ContaCorrente(EmailUsuario, 2);
		}
	break;
		
	case 2:
		break;
	
 }
}
}
