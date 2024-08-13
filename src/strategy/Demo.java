package strategy;

public class Demo {
    public static void show() {
        var imageStorage = new ImageStorage();

        imageStorage.store("myName", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("myName", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
