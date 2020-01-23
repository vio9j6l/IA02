import java.util.ArrayList;
import java.util.List;

public class Shipment {
  private final List<Product> products = new ArrayList<>();

  public void addProduct(Product prod) {
    products.add(prod);
  }

  public List<Product> getProducts() {
    return products;
  }

}

