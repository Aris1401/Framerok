package model;

@Model(nom = "zavatra")
public class Emp {
	@Field(columnName = "id")
	String id;
	
	String notId;
	@Field(columnName = "nomEmp")
	String nom;
	
	public void getAllFieldWithAnnotation() {
		java.lang.reflect.Field[] fields = getClass().getDeclaredFields();
		
		for (java.lang.reflect.Field f : fields) {
			f.setAccessible(true);
			
			if (f.isAnnotationPresent(Field.class)) {
				System.out.print(f.getName() + " | cl Name: ");
				
				Field fl = f.getAnnotation(Field.class);
				System.out.println(fl.columnName()); 
			}
		}
	}
}
