import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        MEMBRO
        */
        Membro bre = new Membro( "Brenno" );
        bre.setId( 1 );
        Membro du = new Membro( "Eduardo" );
        du.setId( 2 );

        /*
        LIVROS
        */
        Livro l1 = new Livro( "Teste" );
        Livro l2 = new Livro( "Branca de Neve" );

        l1.setAutor( "Teste" );
        l2.setAutor( "Wilhelm Grimm" );

        l1.setAnoPublicacao( 2025 );
        l2.setAnoPublicacao( 1820 );

        /*
        METODOS
        */
        System.out.println( bre.adicionarLivro( l1 ) );
        System.out.println( bre.adicionarLivro( l2 ) );
        System.out.println( bre.removerLivro( l1 ) );

        System.out.println( du.adicionarLivro( l1 ) );
        System.out.println( du.adicionarLivro( l2 ) );
        System.out.println( du.removerLivro( l2 ) );


        System.out.println( " " );
        System.out.println( "Livros do " + bre.getNome() + ": " + bre.getLivrosEmprestados() );
        System.out.println( "Livros do " + du.getNome() + ": " + du.getLivrosEmprestados() );

    }

}