package listatelefone;
import java.util.ArrayList;
import java.util.List;

public class ListaTelefonica {
	public ListaTelefonica {
	    private String nome;
	    private String telefone;
	    private String email;

	    public ListaTelefonica(String nome, String telefone, String email) {
	        this.nome = nome;
	        this.telefone = telefone;
	        this.email = email;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public String getEmail() {
	        return email;
	    }
	}

