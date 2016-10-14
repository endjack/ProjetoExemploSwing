
package projetoexemploswing.DAO;

import java.util.ArrayList;
import projetoexemploswing.Banco;
import projetoexemploswing.Dominio.Livro;

public class LivroDao implements GenericDao<Livro>{

    @Override
    public void inserir(Livro obj) {
        Banco.BANCOLIVROS.add(obj);
    }

    @Override
    public void alterar(Livro obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar(Livro obj) {
        Banco.BANCOAUTOR.remove(obj);
    }

    @Override
    public ArrayList<Livro> buscarTodos() {
       return Banco.BANCOLIVROS;
    }
    
}
