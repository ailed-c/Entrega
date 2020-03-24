package refactoring.exercise;

/**
 * 
 * Dada la siguiente clase:
 * 
 * 	1.- Lee el código y crea los tests de junit necesarios
 * 		1.1.- Sigue las indicaciones de la asignatura buscando la máxima cobertura posible
 * 
 * 	2.- Realiza las correcciones que veas necesarias para mejorar la calidad del código.
 *  	2.1.- Añade un comentario en el código explicando el cambio que has realizado
 *  
 * @author Raul.Camarero
 *
 */
public class Evaluate {

	String id; 
	
	String name;
	
	String evaluations;
	
	
	public Evaluate() { 
	}
	
	public Evaluate(String id, String name, String evaluations) {
		this.id = id;
		this.name = name;	
		this.evaluations=evaluations;
	}
	
	/*he quitado el contructor que contenia los atributos ya que el de evaluations[], lo sentia innecesario*/
	
	public String evaluate_pupil(double value) {  
		String annotation = null;
		if(value > 10) {
			annotation=("La nota no es válida. Nadie saca más de 10!!!");/*He cambiado el throw porque debe devolverme una string*/
			/* he cambiado las variables paa que  se incluya el siete y el ocho y el 6*/
			/*he cambiado las lineas del codigo para que quede mas ordenado y eliminado un else vacio*/
		} else {
			if (value > 8) {
				annotation = "SOBRESALIENTE";
			} else {
				if (value > 6) {
					annotation = "NOTABLE";
				} else {
					if (value > 5) {
						annotation = "GOOD";
					} else {
						annotation = "SUSPENSO";
					}
				}
			}
		}
		evaluations=annotation;
		return annotation; /*he a�adido un return solution para poder utilizarlo en el test*/
	}

	
	
	@Override
	public String toString() {
		String s="";
	  s="Añadir al alumno "+name+"("+id+") la nota " + evaluations; /*he hecho un metodo imrpimir para poder cambiar el metodo void anterior*/
		return s;
	}
}

