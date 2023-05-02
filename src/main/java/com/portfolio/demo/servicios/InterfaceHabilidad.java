
import java.util.List;

import com.portfolio.demo.model.Habilidad;


public interface InterfaceHabilidad {
   
   public List<Habilidad> listarTodo();

   public void actualizar(String nombre_icono,String nombre, int porcentaje);

   public void modificar();

   public Habilidad buscar();

   public void eliminar();
   

   
}
