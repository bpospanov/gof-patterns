package strategy;

public class AesEncryptionAlgorithm implements  EncryptionAlgorithm {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using AES algorithm");
    }
}
