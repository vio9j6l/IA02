public class Product
{
  private String id = null;
  private int quantity = 0;
  private String description = null;
  private double weightOunces = 0;

  public Product(String id, int quantity, String description, double weightOunces) {
    this.id = id;
    this.quantity = quantity;
    this.description = description;
    this.weightOunces = weightOunces;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getWeightOunces() {
    return weightOunces;
  }

  public void setWeightOunces(double weightOunces) {
    this.weightOunces = weightOunces;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}

