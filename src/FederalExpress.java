import java.util.Stack;

public class FederalExpress implements IShipper
{

  private static final String NAME = "Federal Express";
  Stack<Product> items = new Stack<>();
  private int totalQuantity = 0;

  @Override
  public void addProducts(Shipment shipment) {
    for (Product item : shipment.getProducts()) {
      items.push(item);
      totalQuantity += item.getQuantity();
    }
  }

  @Override
  public String companyName() {
    return NAME;
  }

  @Override
  public String outPutProducts() {
    StringBuilder stringBuilderReport = new StringBuilder();
    for (Product item : items) {
      stringBuilderReport.append(item.getQuantity());
      stringBuilderReport.append(" " + item.getDescription());
      stringBuilderReport.append(" (" + item.getWeightOunces() + " oz)");
      stringBuilderReport.append(System.lineSeparator());
    }

    stringBuilderReport.append("Total number of items: " + totalQuantity);
    stringBuilderReport.append(System.lineSeparator());
    return stringBuilderReport.toString();
  }
}
