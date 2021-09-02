public class Productos {
    private String tipoDeProducto;
    private Integer precioUnitario;
    private Integer cantidadDeProducto;
    private Integer precioTotal;

    public Productos(String tipoDeProducto, Integer precioUnitario, Integer cantidadDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
        this.precioUnitario = precioUnitario;
        this.cantidadDeProducto = cantidadDeProducto;
        this.precioTotal = cantidadDeProducto * precioUnitario;
    }

    public String getTipoDeProducto() {

        return tipoDeProducto;
    }

    public Integer getPrecioUnitario() {

        return precioUnitario;
    }

    public Integer getCantidadDeProducto() {

        return cantidadDeProducto;
    }

    public Integer getPrecioTotal() {

        return precioTotal;
    }
}
