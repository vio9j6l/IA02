import java.util.ArrayList;
import java.util.List;

public class Shipment
{
  private final List<Product> products = new ArrayList<>();

  public void addProduct(Product product) {
    products.add(product);
  }

  public List<Product> getProducts() {
    return products;
  }

}

