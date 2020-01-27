import java.util.Stack;

public class FederalExpress implements IShipper {

  private static final String NAME = "Federal Express";
  Stack<Product> items = new Stack<>();
  private int total_qty = 0;

  @Override
  public void addProducts(Shipment shipment) {
    for (Product item : shipment.getProducts()) {
      items.push(item);
      total_qty += item.getQty();
    }
  }

  @Override
  public String companyName() {
    return NAME;
  }

  @Override
  public String outPutProducts() {
    StringBuilder sbReport = new StringBuilder();
    for (Product item : items) {
      sbReport.append(item.getQty());
      sbReport.append(" " + item.getDescription());
      sbReport.append(" (" + item.getWeightOunces() + " oz)");
      sbReport.append(System.lineSeparator());
    }

    sbReport.append("Total number of items: " + total_qty);
    sbReport.append(System.lineSeparator());
    return sbReport.toString();
  }
}
