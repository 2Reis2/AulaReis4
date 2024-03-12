package App;
import View.Mensagens;
import model.Banco;
import model.Usuario;
public class Mainclasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Mensagens mensagem = new Mensagens();
	String Nome, CPF, Celular, Email, Senha;
	String opcao = null;
	int opcaoNum;
	
	
	do {
		mensagem.mostrarInformacao("Sistema Bancário"
		+"\nDigite a opção desejada"
		+"\n1. Cadastrar Banco"
		+"\n2. Cadastrar Usuário"
		+"\n3. Sair"
		
		); 
		opcaoNum = Integer.parseInt(opcao);
		
		
	    switch(opcaoNum) {
		case 1:
		String nomeBanco;
		nomeBanco = mensagem.solicitarEntrada("Digite o Nome do Banco");
				Banco novoBanco = new Banco(nomeBanco);
		        mensagem.mostrarMensagemDeSucesso (
		        		"Banco Cadastrado com sucesso"
		        		+ novoBanco.getBanco()
		     );
				
				break;
				
		case 2:
			
		}
		
	Nome = mensagem.solicitarEntrada("Digite seu Nome");
	CPF = mensagem.solicitarEntrada("Digite seu CPF");		
	Celular = mensagem.solicitarEntrada("Digite seu celular");		
	Email = mensagem.solicitarEntrada("Digite seu email");		
	Senha = mensagem.solicitarEntrada("Digite sua senha");
	Usuario usuario = new Usuario(Nome,CPF,Celular,Email,Senha);
	mensagem.mostrarMensagemDeSucesso(usuario.getUsuario());
	opcao="ok";
	} while (opcao == "ok");
	}
	
}
