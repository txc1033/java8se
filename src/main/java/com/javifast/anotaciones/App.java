package com.javifast.anotaciones;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class App {

	@Retention(RetentionPolicy.RUNTIME)
	public @interface Lenguajes {
		Lenguaje[] value() default {};
	}
	
	@Repeatable(value = Lenguajes.class)
	public @interface Lenguaje{
		String value();
		String nombreUsuario() default "JavierMS"; 
	}
	
	//1.7
	/*@Lenguajes({
		@Lenguaje("Español"),
		@Lenguaje("Ingles")
	})*/
	//1.8
	@Lenguaje("Español")
	@Lenguaje("Ingles")
	public interface LenguajeProgramacion{
		
	}

	public static void main(String[] args) {
		Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
		System.out.println("Se tiene " + lenguajeArray.length + " anotaciones en Lenguaje[]");
		
		Lenguajes lenguaje = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
		for(Lenguaje elemento : lenguaje.value()){
			System.out.println(elemento.value());
		}
		
	}
}
