package listatelefone;

import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<ListaTelefonica> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(ListaTelefonica contato) {
        contatos.add(contato);
    }

    public void removerContato(ListaTelefonica contato) {
        contatos.remove(contato);
    }

    public List<ListaTelefonica> listarContatos() {
        return contatos;
    }
}