package com.fSpring.anotacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service ("gestionAlmacen")
public class GestionAlmacen {
	
  @Autowired
  RepoProducto1 repo1;
  @Autowired
  RepoProducto2 repo2;
  public void insertarProducto1(Producto1 producto) {
    repo1.insertar(producto);
  }
  
  public void insertarProducto2(Producto2 producto) {
	    repo2.insertar(producto);
  }  
  
  public List<Producto1> listarTodosProductos1() {
    return repo1.listarTodos();
  }  
  
  public List<Producto2> listarTodosProductos2() {
    return repo2.listarTodos();
  }
  
}
