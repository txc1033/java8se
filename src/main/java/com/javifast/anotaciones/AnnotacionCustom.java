package com.javifast.anotaciones;

public @interface AnnotacionCustom {

	String nombre();
	boolean habilitado() default true;
}
