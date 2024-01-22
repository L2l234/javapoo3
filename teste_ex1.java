package ContaBancaria;

public class teste_ex1 {

	public static void main(String[] args) {
		   ContaBanco minhaConta = new ContaBanco(561989, "Liliana Nicoleti");
	        
	        minhaConta.depositar(2000.0);
	        minhaConta.sacar(700.0);
	        
	        minhaConta.exibirInformacoes();
	    }
	

	}


