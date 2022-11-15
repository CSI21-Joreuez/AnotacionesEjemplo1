package com.fSpring.anotacion;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class RepoProducto1 {
	
  private static List<Producto1> productos1= new ArrayList<Producto1>();
  static {
    
	  productos1.add(new Producto1("ordenador1",200));
	  productos1.add(new Producto1("ordenador2",350));
	  productos1.add(new Producto1("ordenador3",652));
    
  }

  public List<Producto1> listarTodos() {
    
    return productos1;
    
  }
  
  public void insertar(Producto1 producto1) {
    
	  productos1.add(producto1);
	  
  }
  
}
