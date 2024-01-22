package listatelefone;
import java.util.ArrayList;
import java.util.List;

public class List {

	public static void main(String[] args) {
		ListaTelefonica contato1 = new ListaTelefonica("Alice", "123-456-7890", "alice@example.com");
        ListaTelefonica contato2 = new ListaTelefonica("Bob", "987-654-3210", "bob@example.com");

        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        System.out.println("Lista de contatos:");
        List<ListaTelefonica> lista = agenda.listarContatos();
        for (ListaTelefonica contato : lista) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("E-mail: " + contato.getEmail());
            System.out.println();
        }

        agenda.removerContato(contato1);

        System.out.println("Lista de contatos após a remoção:");
        lista = agenda.listarContatos();
        for (ListaTelefonica contato : lista) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("E-mail: " + contato.getEmail());
            System.out.println();
        }
    }


	}
