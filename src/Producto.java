public class Producto {
    String nombre;
    int precio;
    int moneda;
    String cantidad;
    public Producto() {
    }
    public Producto(String nombre, int moneda) {
        this.nombre = nombre;
        this.precio = moneda;
    }

    public Producto(String nombre,int precio,String cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void imprimir(){
        System.out.println("Producto " + nombre + " Cuesto " + precio + " Cantidad " + cantidad + " // ");
    }

    public void imprimir(String pre){
        System.out.println("Su fruta cuesta : " + pre);
    }
    public void imprimir(String pre,int cant,int precio){
        System.out.println("El nombre es producto" + pre + " cantidad " + cant + "precio " + precio);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Producto producto1 = new Producto();
        producto1.imprimir();

        Producto producto2 = new Producto("sadjksha",10);
        producto2.imprimir();

        Producto producto3 = new Producto("Manzanas",10,"cinco");
        producto3.imprimir();
        producto1.imprimir("500");
        producto1.imprimir("Fruta",25,51);
    }
}
