public class Productos {
    private String tipoDeProducto;
    private Integer precioUnitario;
    private Integer cantidadDeProducto;

    public Productos(String tipoDeProducto, Integer precioUnitario, Integer cantidadDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
        this.precioUnitario = precioUnitario;
        this.cantidadDeProducto = cantidadDeProducto;
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
}
