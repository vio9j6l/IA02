import java.text.DecimalFormat;
import java.util.ArrayList;

public class PlanetExpress implements IShipper
{
  //Assign PlanetExpress to Constant NAME for companyName method
  private static final String NAME = "PlanetExpress";

  //two arrayLists for adding the products and output all products
  ArrayList<Product> goods = new ArrayList<Product>();
  ArrayList<String> planetGoods = new ArrayList<String>();

  //To format the totalWeights variable that is double type
  DecimalFormat df = new DecimalFormat("#.0");

  private int totalQuantity = 0;
  private double totalWeight = 0;

  //Get all products information and calculate the total quantity and total weight, then stored in the good ArrayList
  @Override
  public void addProducts(Shipment shipment) {
    for (Product good : shipment.getProducts()) {
      goods.add(good);
      totalQuantity += good.getQuantity();
      totalWeight += good.getWeightOunces();
    }
  }

  /* Get the ID, quantity, description, total quantity, total weight and stored in the planetGoods ArrayList
   * Then return planetGoods ArrayList list
   * Format the planetGoods arrayList including equal number of spacing, get rid of the comma and angle brackets
   */
  @Override
  public String outPutProducts() {
    for (Product planetGood : goods) {
      planetGoods.add("Product ID - " + planetGood.getId());
      planetGoods.add("[" + Integer.toString(planetGood.getQuantity()) + "] ");
      planetGoods.add(planetGood.getDescription());
      planetGoods.add(" (" + planetGood.getWeightOunces() + " oz)\n");
    }
    planetGoods.add("\n Total number of items: " + "[" + totalQuantity + "]");
    planetGoods.add("\n " + "Total weight of items: " + "(" + df.format(totalWeight) + " oz)");
    return planetGoods.toString().replaceAll("(^\\[|\\]$)", " ").replaceAll(",", "");

  }

  //Get the company's name
  @Override
  public String companyName() {
    return NAME;
  }
}
