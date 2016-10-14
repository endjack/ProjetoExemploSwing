
package projetoexemploswing;

import java.util.ArrayList;
import projetoexemploswing.DAO.LivroDao;
import projetoexemploswing.Dominio.Autor;
import projetoexemploswing.Dominio.Livro;

public class ProjetoExemploSwing {

    public static void main(String[] args) {
       
        Livro livro1 = new Livro("Java","123qwe",new Autor("Enderson", "1346579-256"));
        Livro livro2 = new Livro("C++","123qwe",new Autor("Enderson", "1346579-256"));
        
        LivroDao ld = new LivroDao();
        ld.inserir(livro1);
        ld.inserir(livro2);
        
        ArrayList<Livro> livros = ld.buscarTodos();
        
        for(Livro li:livros){
            System.err.println("Livro: "+li.getTitulo());
        }
    }
    
}
