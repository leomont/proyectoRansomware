package ransomwareBackend;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class cifrador {
    private Cipher cipher;
    private SecretKey llave;

    // Constructor por defecto
    public cifrador() {
    }

    // Getters and Setters
    public Cipher getCipher() {
        return cipher;
    }

    public void setCipher(Cipher cipher) {
        this.cipher = cipher;
    }

    public SecretKey getLlave() {
        return llave;
    }

    public void setLlave(SecretKey llave) {
        this.llave = llave;
    }
}