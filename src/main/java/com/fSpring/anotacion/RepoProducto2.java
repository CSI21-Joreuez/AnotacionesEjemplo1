package com.fSpring.anotacion;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class RepoProducto2 {
	
  private static List<Producto2> productos2= new ArrayList<Producto2>();
  static {
    
	  productos2.add(new Producto2("teclado1",20));
	  productos2.add(new Producto2("teclado2",35));
	  productos2.add(new Producto2("teclado3",65));
    
  }

  public List<Producto2> listarTodos() {
    
    return productos2;
    
  }
  
  public void insertar(Producto2 producto2) {
    
	  productos2.add(producto2);
	  
  }
  
}