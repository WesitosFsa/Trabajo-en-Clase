public class Main {
    String nombre;
    int edad;
    String precio;
    String pre;
    public Main(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Main(String precio) {
        this.precio = precio;
    }
    public void imprimir(){
        System.out.print("mi nombre es " + nombre + " y tengo " + edad + " años  ");
    }

    public void imprimir(String pre){
        System.out.print("HE RECORRIDO " + pre);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main persona1 = new Main("Juan", 25);
        persona1.imprimir();

        Main persona2=new Main("26");
        persona2.imprimir("500");
    }
}
