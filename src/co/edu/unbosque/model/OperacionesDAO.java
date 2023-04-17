package co.edu.unbosque.model;

public interface OperacionesDAO {
	
	public void crear(Object o);
	
	public boolean actualizar(int index,  Object o);
	
	public boolean eliminar(int index);
	
	public boolean eliminar(String name);
	
	public void mostrarTodo();
	
	public String mostrar();
}
