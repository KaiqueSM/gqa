package Entity;

public class Acervo {
    
private long id;
private String nome;
private String genero;
private String autor;
private String editora;
private String valor;

    public Acervo(String nome, String genero, String autor, String editora, String valor) {
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.valor = valor;
    }

    public Acervo(String nome) {
        this.nome = nome;
    }
    
    public Acervo (long id){
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    public long getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
