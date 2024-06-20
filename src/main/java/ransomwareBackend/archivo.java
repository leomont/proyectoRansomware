package ransomwareBackend;


public class archivo {
    private String rutaArchivo;
    private cifrador cifrador;

    // Constructor por defecto
    public archivo() {
    }

    // Constructor con todos los campos
    public archivo(String rutaArchivo, cifrador cifrador) {
        this.rutaArchivo = rutaArchivo;
        this.cifrador = cifrador;
    }

    // Getters and Setters
    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public cifrador getCifrador() {
        return cifrador;
    }

    public void setCifrador(cifrador cifrador) {
        this.cifrador = cifrador;
    }
}