package strategy;

public class ChatClient {

    public void send(String message, EncryptionAlgorithm encryptionAlgorithm) {
        encryptionAlgorithm.encrypt(message);
    }
}
