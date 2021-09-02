public class Clientes {
    private String nombre;
    private String domicilio;
    private String correoElectronico;
    private Integer saldo;


    public Clientes(String nombre, String domicilio, String correoElectronico, Integer saldo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correoElectronico = correoElectronico;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public Integer getSaldo() {
        return saldo;
    }
}
