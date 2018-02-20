package com.javifast.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {

	private List<String> lista;

	public void llenarLista() {
		lista = new ArrayList<>();

		lista.add("Javier");
		lista.add("Javifast");
		lista.add("JavierMS");
	}

	public void usarForEach() {
		/*for(String elemento : lista){
			System.out.println(elemento);
		}*/
		
		//lista.forEach(x -> System.out.println(x));		
		lista.forEach(System.out::println);
		
	}

	public void usarRemoveIf() {
		/*Iterator<String> it = lista.iterator();	
		while(it.hasNext()){
			if(it.next().equalsIgnoreCase("Javifast")){
				it.remove();
			}
		}*/
		
		lista.removeIf(x -> x.equalsIgnoreCase("Javifast"));
		
	}
	

	public void usarSort() {
		lista.sort((x,y)-> x.compareTo(y));
	}

	public static void main(String... mitocode) {
		ColeccionApp app = new ColeccionApp();
		app.llenarLista();		
		//app.usarRemoveIf();
		app.usarSort();
		app.usarForEach();
	}

}
