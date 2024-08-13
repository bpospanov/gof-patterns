package iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private final List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator<Product> getIterator() {
    return new ProductCollectionIterator(this);
  }

  public static class ProductCollectionIterator implements Iterator<Product> {
    private final ProductCollection collection;
    private int index = 0;

    public ProductCollectionIterator(ProductCollection collection) {

      this.collection = collection;
    }
    @Override
    public boolean hasNext() {
      return index < collection.products.size();
    }

    @Override
    public void next() {
      index++;
    }

    @Override
    public Product current() {
      return collection.products.get(index);
    }
  }
}
