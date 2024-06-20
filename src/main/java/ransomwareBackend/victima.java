package ransomwareBackend;

public class victima {
    private String id;
    private String correoElectronicoVictima;
    private String llaveCifrado;
    private String llaveDescrifrado;

    // Constructor por defecto
    public victima() {
    }

    // Constructor con todos los campos
    public victima(String id, String correoElectronicoVictima, String llaveCifrado, String llaveDescrifrado) {
        this.id = id;
        this.correoElectronicoVictima = correoElectronicoVictima;
        this.llaveCifrado = llaveCifrado;
        this.llaveDescrifrado = llaveDescrifrado;
    }


    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreoElectronicoVictima() {
        return correoElectronicoVictima;
    }

    public void setCorreoElectronicoVictima(String correoElectronicoVictima) {
        this.correoElectronicoVictima = correoElectronicoVictima;
    }

    public String getLlaveCifrado() {
        return llaveCifrado;
    }

    public void setLlaveCifrado(String llaveCifrado) {
        this.llaveCifrado = llaveCifrado;
    }

    public String getLlaveDescrifrado() {
        return llaveDescrifrado;
    }

    public void setLlaveDescrifrado(String llaveDescrifrado) {
        this.llaveDescrifrado = llaveDescrifrado;
    }
}