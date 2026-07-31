public class Cuenta {
    private double saldo;


    public void depositar(double monto){
        if (monto <= 0){
        throw new IllegalArgumentException("Cantidad invalida");
        }

        saldo += monto;
    }
    
    public void retirar (double monto){

        if(monto <= 0){
        throw new IllegalArgumentException("Cantidad invalida");
        }
        if (saldo < monto)
        throw new IllegalArgumentException("Saldo insuficiente");
        
        saldo -= monto;
    }

    public double mostrarSaldo(){
        return saldo;
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.depositar(100);
        cuenta1.depositar(200);

        System.out.println("\nEl saldo de la cuenta 1 es: "+ cuenta1.mostrarSaldo());

    }
}