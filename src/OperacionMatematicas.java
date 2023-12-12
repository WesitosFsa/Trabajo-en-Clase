public class OperacionMatematicas {
    double suma;
    public OperacionMatematicas(){
    }
    public void Operacion(int n1,int n2){
        suma = n1 + n2;
        System.out.println("Suma de 2 numeros " + suma);
    }
    public void Operacion(int n1,int n2,int n3){
        suma = n1 + n2 + n3 + 5;
        System.out.println("Suma de 3 numeros " + suma);
    }
    public void Operacion(double decimal1,double decimal2){
        suma = decimal1+decimal2 + 2;
        System.out.println("Suma de 2 numeros " + suma );
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        OperacionMatematicas iniciar = new OperacionMatematicas();
        iniciar.Operacion(1,2);
        iniciar.Operacion(1,2,3);
        iniciar.Operacion(2.3,2.6);
    }


}
