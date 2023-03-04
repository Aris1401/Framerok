package main;

import java.util.ArrayList;

import model.AnnotationGetter;
import model.Model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Class<?>> allClasses = (ArrayList<Class<?>>) AnnotationGetter.getClassesWithAnnotation(Model.class);
		
		for (Class<?> cl : allClasses) {
			System.out.println(cl.getName());
		}
		
		System.out.println("Voila, total: " + allClasses.size());
	}

}
