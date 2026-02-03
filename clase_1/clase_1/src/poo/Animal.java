package poo;


public class Animal {
    String nombre;
    int edad;
    float peso;
    boolean vacunado;
    char genero;

    public Animal(String nombre, int edad, float peso, boolean vacunado, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
        this.genero = genero;
    }

    public Animal() {
        nombre = "Sin nombre";
        edad = 0;
        peso = 0.0f;
        vacunado = false;
        genero = 'U'; // U de desconocido
    }


    // Funcion
    public String getVerboseGenero() {
        if (genero == 'M') {
            return "Masculino";
        } else if (genero == 'F') {
            return "Femenino";
        } else {
            return "Genero desconocido";
        }
    }

    // Procedure
    public void setPeso(float cantidad) {
        peso = cantidad;
    }


    // Funcion
    public float calcularIMC() {
        return peso / (edad * 2);
    }

    public void getInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Vacunado: " + vacunado);
        System.out.println("Genero: " + getVerboseGenero());
    }


}
