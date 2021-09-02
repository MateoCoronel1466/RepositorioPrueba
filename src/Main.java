public class Main {

    public static void main(String[] args) {

        Productos primerProducto = new Productos("Remera de independiente", 1500, 1);
        Productos primerProductoMayorista = new Productos("Botines", 2000, 10);
        Clientes primerCliente = new Clientes("Gonzalo", "Roosvelt 1465", "holaNose@gmail.com", 1000);
        ClientesMayoristas primerClienteMayorista = new ClientesMayoristas("Boro", "Granaderos 42", "boro123@gmail.com");

        Integer precioUnitario = primerProducto.getPrecioUnitario();
        Integer saldo = primerCliente.getSaldo();
        Integer precioTotal = primerProducto.getPrecioTotal();
        String nombreMayorista = primerClienteMayorista.getNombreMayorista();

        if(saldo >= primerProducto.getPrecioTotal()){

            Integer saldoRestante = saldo - primerProducto.getPrecioTotal();
            System.out.println("Compra finalizada");
            System.out.println("Tu saldo restante es de " + "$" + saldoRestante);

        } else {

            System.out.println("Fallo en la compra. Dinero insuficiente");

        }

        System.out.println("Compra finalizada " + nombreMayorista);

    }

}