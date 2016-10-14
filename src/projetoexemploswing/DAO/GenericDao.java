
package projetoexemploswing.DAO;
import java.util.ArrayList;

public interface GenericDao<T> {
    
    public void inserir(T obj);
    public void alterar(T obj);
    public void apagar(T obj);
    public ArrayList<T> buscarTodos();
}
