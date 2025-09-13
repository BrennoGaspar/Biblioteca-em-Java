public class Livro {

    /*
    ATRIBUTOS
    */
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean estaEmprestado;

    /*
    CONSTRUTOR
    */
    public Livro( String titulo ){
        this.titulo = titulo;
    }

    /*
    METODOS ESSENCIAIS
    */
    public String emprestar(){

        if( estaEmprestado ){
            return "Voce nao consegue pegar esse livro, pois ja esta sendo usado!";
        }

        estaEmprestado = true;
        return "Voce consegue pegar esse livro!";

    }

    public void devolver(){

        estaEmprestado = false;

    }

    /*
    METODOS SETTERS
    */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    /*
    METODOS GETTERS
    */
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEstaEmprestado() {
        return estaEmprestado;
    }

}
