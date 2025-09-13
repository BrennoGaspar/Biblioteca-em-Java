import java.util.ArrayList;
import java.util.stream.Collectors;

public class Membro {

    /*
    ATRIBUTOS
    */
    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    /*
    CONSTRUTOR
    */
    public Membro( String nome ){
        this.nome = nome;
    }

    /*
    METODOS PRINCIPAIS
    */
    public String adicionarLivro( Livro livro ){

        if( livro.isEstaEmprestado() ){
            return "Não é possivel alugar o livro! (" + livro.getTitulo() + ")";
        }
        livro.emprestar();
        livrosEmprestados.add( livro );
        return ( getNome() + " alugou o livro! (" + livro.getTitulo() + ")" );

    }

    public String removerLivro( Livro livro ){

        int contador = 0;

        for( Livro livroX : livrosEmprestados ){

            if( livroX.getTitulo() == livro.getTitulo() ){
                livrosEmprestados.remove( livroX );
                livro.devolver();
                contador += 1;
                return ( getNome() + " devolveu o livro! (" + livro.getTitulo() + ")" );
            }

        }
        if( contador == 0 ){
            return ( "O livro " + livro.getTitulo() + " nao esta com o " + getNome() );
        }
        return ( "Algo deu errado!" );

    }

    /*
    METODOS SETTERS
    */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*
    METODOS GETTERS
    */
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getLivrosEmprestados() {
        return livrosEmprestados.stream()
                .map(Livro::getTitulo)
                .collect(Collectors.joining( ", " ));
    }

}
