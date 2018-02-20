package com.javifast.defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB{

	@Override
	public void caminar() {		
		System.out.println("Hola");
	}	
		
	@Override
	public void hablar() {
		//PersonaB.super.hablar();
		System.out.println("Estoy hablando XD");
	}
	
	/*@Override
	public void hablar() {
		PersonaB.super.hablar();
	
	}*/

	public static void main(String... args) {
		DefaultMethod app = new DefaultMethod();
		app.hablar();
	}
	
}
