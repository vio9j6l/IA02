public class UnitedParcelService implements IShipper
{

  Product product1 = null;
  Product product2 = null;
  Product product3 = null;
  Product product4 = null;

  @Override
  public void addProducts(Shipment shipment) {
    product1 = shipment.getProducts().get(0);
    product2 = shipment.getProducts().get(1);
    product3 = shipment.getProducts().get(2);
    product4 = shipment.getProducts().get(3);
  }

  @Override
  public String companyName() {
    return "UPS";
  }

  @Override
  public String outPutProducts() {
    String listOfItems = "";
    listOfItems = listOfItems + product1.getDescription() + " [" + product1.getQuantity() + "]" + System.lineSeparator();
    listOfItems = listOfItems + product2.getDescription() + " [" + product2.getQuantity() + "]" + System.lineSeparator();
    listOfItems = listOfItems + product3.getDescription() + " [" + product3.getQuantity() + "]" + System.lineSeparator();
    listOfItems = listOfItems + product4.getDescription() + " [" + product4.getQuantity() + "]" + System.lineSeparator();

    return listOfItems;
  }


}

