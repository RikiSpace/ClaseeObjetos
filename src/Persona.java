public class Persona {

    String nombre;
    String edad;
    String sexo;

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Sara";
        persona1.edad = "16";
        persona1.sexo = "Femenino";

        Persona persona2 = new Persona();
        persona2.nombre = "Saray";
        persona2.edad = "17";
        persona2.sexo = "Femenino";

        Persona persona3 = new Persona();
        persona3.nombre = "Isabella";
        persona3.edad = "18";
        persona3.sexo = "Femenino";

        System.out.println("El Nombre de la persona 1 es: "+persona1.nombre+"\n");
        System.out.println("La Edad de la persona 1 es: "+persona1.edad+"\n");
        System.out.println("El Sexo de la persona 1 es: "+persona1.sexo+"\n");

        System.out.println("El Nombre de la persona 2 es: "+persona2.nombre+"\n");
        System.out.println("La Edad de la persona 2 es: "+persona2.edad+"\n");
        System.out.println("El Sexo de la persona 2 es: "+persona2.sexo+"\n");

        System.out.println("El Nombre de la persona 3 es: "+persona3.nombre+"\n");
        System.out.println("La Edad de la persona 3 es: "+persona3.edad+"\n");
        System.out.println("El Sexo de la persona 3 es: "+persona3.sexo+"\n");



    }
}

