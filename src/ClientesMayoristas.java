public class ClientesMayoristas {
    private String nombreMayorista;
    private String direccionMayorista;
    private String emailMayorista;


    public ClientesMayoristas(String nombreMayorista, String direccionMayorista, String emailMayorista) {
        this.nombreMayorista= nombreMayorista + " FC";
        this.direccionMayorista = direccionMayorista;
        this.emailMayorista = emailMayorista;
    }

    public String getNombreMayorista() {
        return nombreMayorista;
    }

    public String getDireccionMayorista() {
        return direccionMayorista;
    }

    public String getEmailMayorista() {
        return emailMayorista;
    }

}
