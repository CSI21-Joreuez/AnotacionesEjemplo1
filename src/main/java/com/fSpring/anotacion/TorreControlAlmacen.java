package com.fSpring.anotacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TorreControlAlmacen {

	@Autowired GestionAlmacen gestorTorre;
	@RequestMapping("/listaProductos1") 
	
	public String listaProductos1(Model modelo) {
	modelo.addAttribute("listaProductos1", gestorTorre.listarTodosProductos1());
	return "listaProductos1"; 
		         }
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml");
		GestionAlmacen gestor = (GestionAlmacen) context.getBean("gestionAlmacen");
		System.out.println(gestor.listarTodosProductos1().get(0).getNombre());
		System.out.println(gestor.listarTodosProductos2().get(0).getNombre());
		
	}

}
