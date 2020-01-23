public class UnitedParcelService implements IShipper {

  Product prod1 = null;
  Product prod2 = null;
  Product prod3 = null;
  Product prod4 = null;

  @Override
  public void addProducts(Shipment shipment) {
    prod1 = shipment.getProducts().get(0);
    prod2 = shipment.getProducts().get(1);
    prod3 = shipment.getProducts().get(2);
    prod4 = shipment.getProducts().get(3);
  }

  @Override
  public String companyName() {
    return "UPS";
  }

  @Override
  public String outputProducts() {
    String listOfItems = "";
    listOfItems = listOfItems + prod1.getDescription() + " [" + prod1.getQty() + "]" + System.lineSeparator();
    listOfItems = listOfItems + prod2.getDescription() + " [" + prod2.getQty() + "]" + System.lineSeparator();
    listOfItems = listOfItems + prod3.getDescription() + " [" + prod3.getQty() + "]" + System.lineSeparator();
    listOfItems = listOfItems + prod4.getDescription() + " [" + prod4.getQty() + "]" + System.lineSeparator();

    return listOfItems;
  }


}

