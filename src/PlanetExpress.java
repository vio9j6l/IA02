import java.text.DecimalFormat;
import java.util.ArrayList;

public class PlanetExpress implements IShipper
{
  private static final String NAME = "PlanetExpress";
  ArrayList<Product> goods = new ArrayList<Product>();
  private int totalQuantity = 0;
  private double totalWeight = 0;

  @Override
  public void addProducts(Shipment shipment) {
    for (Product good : shipment.getProducts()){
      goods.add(good);
      totalQuantity += good.getQuantity();
      totalWeight += good.getWeightOunces();
      //goods.addAll((Collection<? extends Product>) good);
    }
  }

  @Override
  public String outPutProducts() {
    ArrayList<String> planetGoods = new ArrayList<String>();
    DecimalFormat df = new DecimalFormat("#.0");
    for (Product planetGood : goods){
      //String quantity = Integer.toString(planetGood.getQuantity());
      planetGoods.add("[" + Integer.toString(planetGood.getQuantity()) + "] ");
      //planetGoods.add(quantity);
      planetGoods.add(planetGood.getDescription());
      planetGoods.add(" (" + planetGood.getWeightOunces() + " oz)\n");
      //planetGoods.add(System.lineSeparator());
    }
    planetGoods.add("Total number of items: " + totalQuantity);
    planetGoods.add("\nTotal weight of items: " + df.format(totalWeight));
    //planetGoods.add(System.lineSeparator());
    return planetGoods.toString().replaceAll("(^\\[|\\]$)", "").replaceAll(",", "");
    //return planetGoods.toString().replaceAll("(^\\[|\\]$)" + ",", "");
  }

  @Override
  public String companyName() {
    return NAME;
  }
}
