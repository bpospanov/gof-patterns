package iterator;

public class Demo {
    public static void show() {
        Product product1 = new Product(1, "Lawn Mawner");
        Product product2 = new Product(2, "Scooter");
        Product product3 = new Product(3, "Dog licker");

        ProductCollection collection = new ProductCollection();
        collection.add(product1);
        collection.add(product2);
        collection.add(product3);

        Iterator<Product> iterator = collection.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
