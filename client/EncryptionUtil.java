import java.security.*;

public class EncryptionUtil {
    private KeyPair keyPair;

    public EncryptionUtil() throws NoSuchAlgorithmException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        keyPair = keyGen.generateKeyPair();
    }

    public PublicKey getPublicKey() {
        return keyPair.getPublic();
    }
}