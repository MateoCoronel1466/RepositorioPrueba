public class Main {

    public static void main(String[] args) {

        Productos primerProducto = new Productos("Remera", 1600, 1);
        Clientes primerCliente = new Clientes("Joaquin", "Granaderos 42", "holaNose", 1500);

        Integer name = primerProducto.getPrecioUnitario();
        Integer saldo = primerCliente.getSaldo();

        if(saldo >= primerProducto.getPrecioUnitario()){
            System.out.println("Compra finalizada");
        } else {
            System.out.println("Fallo en la compra. Dinero insuficiente");

        }

    }

}