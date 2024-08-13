package strategy;

public class Demo {
    public static void show() {
        var chatClient = new ChatClient();
        chatClient.send("this is message", new DesEncryptionAlgorithm());
        chatClient.send("this is message", new AesEncryptionAlgorithm());
    }
}
