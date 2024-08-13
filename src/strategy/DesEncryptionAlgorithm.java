package strategy;

public class DesEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using DES algorithm");
    }
}
