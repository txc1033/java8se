package com.javifast.defaultMethod;

public interface PersonaB {

	default public void hablar(){
		System.out.println("Saludos - PersonaB");
	}
}
