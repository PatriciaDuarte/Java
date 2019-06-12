package Biblioteca;

import java.io.IOException;
import java.util.List;;

public interface Ações {
	
	public abstract void entrada();
	public abstract void cadastrar(String path, List<String>l)throws IOException;
	public abstract void busca(String path)throws IOException;
	public abstract void listar(String path) throws IOException;
}
